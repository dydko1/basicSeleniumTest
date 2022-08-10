package training.serialize.start1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayWrite {

    public static void main(String[] args) {
        Person[] people = {new Person(1, "Miro"), new Person(2, "Ann"), new Person(3, "Naka")};

        ArrayList<Person> personArrayList = new ArrayList<Person>(Arrays.asList(people));

        try (FileOutputStream fs = new FileOutputStream("test.ser");ObjectOutputStream objectOutputStream = new ObjectOutputStream(fs)) {

            objectOutputStream.writeObject(people);

            objectOutputStream.writeObject(personArrayList);

            objectOutputStream.writeInt(personArrayList.size());
            for(Person p: personArrayList){
            objectOutputStream.writeObject(p);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
