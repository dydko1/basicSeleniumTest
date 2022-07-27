package training.serialize.start1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArrayRead {
    public static void main(String[] args) {
        System.out.println("read data");

        try(FileInputStream fi = new FileInputStream("test.ser"); ObjectInputStream os = new ObjectInputStream(fi)) {

            // Read entire array
            Person[] people = (Person[])os.readObject();

            // Read entire arraylist
            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();

            for(Person person: people) {
                System.out.println(person);
            }

            for(Person person: peopleList) {
                System.out.println(person);
            }

            // Read objects one by one.
            int num = os.readInt();

            for(int i=0; i<num; i++) {
                Person person = (Person)os.readObject();
                System.out.println(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
