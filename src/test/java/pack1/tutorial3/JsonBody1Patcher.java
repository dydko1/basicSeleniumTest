package pack1.tutorial3;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.util.List;
import java.util.Map;

public class JsonBody1Patcher {

    public static String applyPatch(
            String jsonBody,
            Map<String, String> patch,
            Scenario1Context ctx
    ) {
        DocumentContext doc = JsonPath.parse(jsonBody);

        patch.forEach((key, rawValue) -> {
            Object value = resolveValue(rawValue, ctx);

            // wariant: products[code=A1].price
            if (key.contains("[") && key.contains("=")) {
                applyByFilter(doc, key, value);
            }
            // wariant: customers[0].name albo customer.firstName
            else {
                String jsonPath = "$." + key;
                doc.set(jsonPath, value);
            }
        });

        return doc.jsonString();
    }

    /**
     * Obsługa klucza typu:
     * products[code=A1].price
     */
    private static void applyByFilter(
            DocumentContext doc,
            String key,
            Object value
    ) {
        // products[code=A1].price
        String arrayName = key.substring(0, key.indexOf('['));
        String filterPart = key.substring(key.indexOf('[') + 1, key.indexOf(']')); // code=A1
        String fieldName = key.substring(key.indexOf("].") + 2);                  // price

        String filterField = filterPart.split("=")[0]; // code
        String filterValue = filterPart.split("=")[1]; // A1

        // read tablicy jako List<Map>
        List<Map<String, Object>> elements =
                doc.read("$." + arrayName);

        for (int i = 0; i < elements.size(); i++) {
            Object candidate = elements.get(i).get(filterField);

            if (filterValue.equals(String.valueOf(candidate))) {
                // znaleziono -> ustawiamy po indeksie
                doc.set("$." + arrayName + "[" + i + "]." + fieldName, value);
                return;
            }
        }

        // fail-fast: retry tu nie pomoze
        throw new IllegalStateException(
                "No element found for key: " + key
        );
    }

    /**
     * Placeholdery:
     * $context.xxx
     * $random.email
     */
    private static Object resolveValue(String raw, Scenario1Context ctx) {
        if (raw == null) return null;

        if (raw.startsWith("$context.")) {
            String ctxKey = raw.substring("$context.".length());
            return ctx.get(ctxKey);
        }

        if (raw.equals("$random.email")) {
            return "user" + System.nanoTime() + "@example.com";
        }

        // prosta konwersja typow (opcjonalnie)
        if ("true".equalsIgnoreCase(raw)) return true;
        if ("false".equalsIgnoreCase(raw)) return false;

        try {
            return Integer.valueOf(raw);
        } catch (NumberFormatException ignored) {
        }

        return raw;
    }
}