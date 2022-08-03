package pl.sii.designPatterns.factoryPattern2.abs;

import java.util.HashMap;
import java.util.Map;

public abstract class Item {
   protected Map<String, String> templates = new HashMap<>();

    protected Item() {
        initTemplates();
    }

    private void initTemplates() {
        templates.put("WhoCreated", "<<Your login appears here>>");
        templates.put("WhenCreated", "<<Creation date is here>>");
    }

    protected abstract void fillTemplates();

    public Map<String, String> getTemplates() {
        return templates;
    }

    public void putTemplateValue(String label, String value) {
        templates.put(label, value);
    }
}
