package pl.sii.trash.files;

import java.io.File;
import java.io.IOException;

public class FirstFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("mirek.txt");
            if (myFile.createNewFile())
                System.out.println("File created: " + myFile.getName());
            else
                System.out.println("File exists");
        } catch (IOException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
