package lombok;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) throws IOException {

        TestData testData = new TestData(); // jako static
        //testData.name = "Miro";
        //testData.lastname = "Dydko";


        System.out.println(testData.toString());
        System.out.println("sss=" + testData.lists.get(1));

        Gson gson = new GsonBuilder().setPrettyPrinting().create(); //new Gson();
        String jsonString = gson.toJson(testData);
        System.out.println(jsonString);

        FileWriter fileWriter = new FileWriter("plik2.json");
        fileWriter.write(jsonString);
        fileWriter.close();

        Gson gson2 = new Gson();

        // 1. JSON file to Java object
        TestData object2 = gson2.fromJson(new FileReader("plik2.json"), TestData.class);

//        TestData jobj = new Gson().fromJson(jsonString, TestData.class);

        System.out.println("eeee="+object2);
        System.out.println("value is: " +object2.getLists());
//
//        User user = new User(1, "Tom Smith", "American");
//        gson.toJson(user, new FileWriter("plik2.json"));
    }
}
