package pl.sii.designPatterns.factoryPattern2;

import pl.sii.designPatterns.factoryPattern2.abs.Item;
import pl.sii.designPatterns.factoryPattern2.abs.ItemFactory;
import pl.sii.designPatterns.factoryPattern2.doc.NoteItem;

public class NotesProducer implements ItemFactory {

    @Override
    public Item createItem() {
        NoteItem noteItem = new NoteItem();
        noteItem.fillTemplates();
        return noteItem;
    }
}
