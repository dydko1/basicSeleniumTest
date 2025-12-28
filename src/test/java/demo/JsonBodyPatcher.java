package demo;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.util.Map;

public class JsonBodyPatcher {

    public static String applyPatch(String jsonBody, Map<String, String> patch, ScenarioContext ctx) {
        DocumentContext doc = JsonPath.parse(jsonBody);

        patch.forEach((key, rawValue) -> {
            String value = process(rawValue, ctx);
            String jsonPath = toJsonPath(key);
            doc.set(jsonPath, value);
        });

        return doc.jsonString();
    }

    // customer.firstName -> $.customer.firstName
    private static String toJsonPath(String key) {
        return "$." + key;
    }

    // placeholder resolver: $context.xxx, $random.email
    private static String process(String raw, ScenarioContext ctx) {
        if (raw == null) return null;

        if (raw.startsWith("$context.")) {
            String k = raw.substring("$context.".length());
            Object v = ctx.get(k);
            return v == null ? null : v.toString();
        }

        if (raw.equals("$random.email")) {
            return "user" + System.nanoTime() + "@example.com";
        }

        return raw;
    }
}