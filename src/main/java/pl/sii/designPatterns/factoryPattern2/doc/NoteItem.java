package pl.sii.designPatterns.factoryPattern2.doc;

import pl.sii.designPatterns.factoryPattern2.abs.Item;

public class NoteItem extends Item {
    @Override
    public void fillTemplates() {
        templates.put("content", "<<Please write your notes here>>");
    }
}
