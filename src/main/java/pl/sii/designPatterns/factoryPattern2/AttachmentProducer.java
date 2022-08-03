package pl.sii.designPatterns.factoryPattern2;

import pl.sii.designPatterns.factoryPattern2.abs.Item;
import pl.sii.designPatterns.factoryPattern2.abs.ItemFactory;
import pl.sii.designPatterns.factoryPattern2.doc.AttachmentItem;

public class AttachmentProducer implements ItemFactory {
    @Override
    public Item createItem() {
        AttachmentItem attachmentItem = new AttachmentItem();
        attachmentItem.fillTemplates();
        return attachmentItem;
    }
}

