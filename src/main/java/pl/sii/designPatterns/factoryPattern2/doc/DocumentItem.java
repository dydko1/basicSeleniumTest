package pl.sii.designPatterns.factoryPattern2.doc;

import pl.sii.designPatterns.factoryPattern2.abs.Item;

public class DocumentItem extends Item {
    @Override
    public void fillTemplates() {
        templates.put("title", "<>");
        templates.put("content","<>");
    }
}
