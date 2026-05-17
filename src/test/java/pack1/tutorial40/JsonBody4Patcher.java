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
