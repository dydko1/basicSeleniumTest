package pack1.tutorial40;

import org.apache.commons.collections4.map.HashedMap;

import java.util.Map;

public class Scenario4Context {

    private final Map<String, Object> data = new HashedMap<>();

    public Object put(String key, Object value) {
        return data.put(key, value);
    }

    public Object get(String key) {
        return data.get(key);
    }

    public String getString(String key) {
        return data.get(key).toString();
    }
}