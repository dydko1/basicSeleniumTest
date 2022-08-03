package pl.sii.designPatterns.factoryPattern2.doc;

import pl.sii.designPatterns.factoryPattern2.abs.Item;

public class AttachmentItem extends Item {
    @Override
    public void fillTemplates() {
        templates.put("name", "");
        templates.put("extension", "");
        templates.put("fullName",

                "<>");
    }
}
