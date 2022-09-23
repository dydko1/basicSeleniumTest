package pl.sii.trash.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWrite = new FileWriter("file2.txt");
            myWrite.write("Files in Java might be tricky, but it is fun enough!");
            myWrite.close();
            System.out.println("File write successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
