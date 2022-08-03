package pl.sii.designPatterns.factoryPattern2;

import pl.sii.designPatterns.factoryPattern2.abs.Item;
import pl.sii.designPatterns.factoryPattern2.doc.NoteItem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FactoryMain2 {
    public static void main(String[] args) {
        DocumentItemProducer documentItemProducer = new DocumentItemProducer();
        Item document = documentItemProducer.createItem();

        AttachmentProducer attachmentProducer = new AttachmentProducer();
        Item attachment = attachmentProducer.createItem();

        NotesProducer notesProducer = new NotesProducer();
        Item note = notesProducer.createItem();
        // ---
        documentTemplate(document);

        documentUseCase(document);
    }

    private static void documentTemplate(Item document) {
        System.out.println(String.format("%s: %s", "Document title",
                document.getTemplates().get("title")));
        System.out.println(String.format("%s: %s", "Who created",
                document.getTemplates().get("whoCreated")));
        System.out.println(String.format("%s: %s", "When document was created",
                document.getTemplates().get("whenCreated")));
        System.out.println("\n");
    }

    private static void documentUseCase(Item document) {

        document.putTemplateValue("title", "Kontrakt b2b");
        document.putTemplateValue("whoCreated", "Jan Kowalski");
        document.putTemplateValue("whenCreated",
                DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm").format(LocalDateTime.now()));

        System.out.println(String.format("%s: %s", "Document title",
                document.getTemplates().get("title")));
        System.out.println(String.format("%s: %s", "Who created",
                document.getTemplates().get("whoCreated")));
        System.out.println(String.format("%s: %s", "When document was created",
                document.getTemplates().get("whenCreated")));
    }
}
