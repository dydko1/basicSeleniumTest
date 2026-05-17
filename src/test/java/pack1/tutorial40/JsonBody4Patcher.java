package pack1.tutorial40;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.util.Map;

public class JsonBody4Patcher {

    public static String patch(String jsonBody, Map<String, String> map) {
        DocumentContext context = JsonPath.parse(jsonBody);

        map.forEach((jsonPath, value) -> {
            String finalValue = resolveValue(value);
            context.set(jsonPath, finalValue);
        });
        return context.jsonString();
    }

    public static String createNestedJsonFromMap(Map<String, String> map) {

        DocumentContext context = JsonPath.parse("{}");

        map.forEach((path, value) -> {

            String finalValue = resolveValue(value);

            putNestedValue(context, path, finalValue);
        });

        return context.jsonString();
    }

    private static void putNestedValue(DocumentContext context, String path, String value) {

        String cleanPath = path.replace("$.", "");

        String[] parts = cleanPath.split("\\.");

        String currentPath = "$";

        for (int i = 0; i < parts.length; i++) {

            String field = parts[i];

            boolean last = i == parts.length - 1;

            if (last) {
                context.put(currentPath, field, value);
            } else {

                String nextPath = currentPath + "." + field;

                try {
                    context.read(nextPath);
                } catch (Exception e) {
                    context.put(currentPath, field, new java.util.LinkedHashMap<>());
                }

                currentPath = nextPath;
            }
        }
    }

    public static String createJsonFromMap(Map<String, String> map) {

        DocumentContext context = JsonPath.parse("{}");

        map.forEach((path, value) -> {

            String finalValue = resolveValue(value);

            String fieldName = path.replace("$.", "");

            context.put("$", fieldName, finalValue);
        });

        return context.jsonString();
    }

    private static String resolveValue(String value) {
        if ("phone".equals(value)) {
            return DataGenerator.phone();
        }

        if ("pesel".equals(value)) {
            return DataGenerator.pesel();
        }

        if ("email".equals(value)) {
            return DataGenerator.email();
        }

        return value;
    }
}
