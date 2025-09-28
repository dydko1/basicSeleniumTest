package pack1;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import pack1.model.Book;

import java.util.List;
import java.util.Map;

public class UsingDataStep {


    @DataTableType
    public Book bookEntryTransformer1(Map<String, String> row) {

        return new Book(
                row.get("title"),
                row.get("author"),
                row.get("yearOfPublishing")
        );
    }

    @Given("the following books")
    public void followingBooks(List<Book> books) {
        System.out.println("********************************************");
        for (Book s : books) {
            System.out.println(s.getTitle() + "\t" + s.getYearOfPublishing() + "\t" + s.getAuthor());
        }
        System.out.println("********************************************");
    }
}