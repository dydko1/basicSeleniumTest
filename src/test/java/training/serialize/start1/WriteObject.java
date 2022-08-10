package training.serialize.start1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person mirek = new Person(1, "Mirek");
        Person anna = new Person(2, "Anna");
        System.out.println(mirek);
        System.out.println(anna);

        try (FileOutputStream fs = new FileOutputStream("people.bin")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(mirek);
            os.writeObject(anna);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
