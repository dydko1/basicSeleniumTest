package training.serialize.start1;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        System.out.println("Read data ....");

        try (FileInputStream file = new FileInputStream("people.bin")) {

            ObjectInputStream os = new ObjectInputStream(file);
            Person person1 = (Person) os.readObject();
            Person person2 = (Person) os.readObject();

            os.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
