package pl.sii.designPatterns.factoryPattern2;

import pl.sii.designPatterns.factoryPattern2.abs.Item;
import pl.sii.designPatterns.factoryPattern2.abs.ItemFactory;
import pl.sii.designPatterns.factoryPattern2.doc.DocumentItem;

public class DocumentItemProducer implements ItemFactory {
    @Override
    public Item createItem() {
        DocumentItem documentItem=new DocumentItem();
        documentItem.fillTemplates();
        return documentItem;
    }
}
