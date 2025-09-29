package pack1;

import java.util.List;
import java.util.Map;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.collections4.CollectionUtils;

import pack1.model.Book;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsingDataStep {

    private List<Book> actualBooks;

    @DataTableType(replaceWithEmptyString = "[anonymous]")
    public Book bookEntryTransformer1(Map<String, String> row) {

        return new Book(
                row.get("title"),
                row.get("author"),
                row.get("yearOfPublishing")
        );
    }

    @Given("the following books")
    public void followingBooks(List<Book> books) {

        actualBooks = books;

        System.out.println("********************************************");
        for (Book s : books) {
            System.out.println(s.getTitle() + "\t" + s.getYearOfPublishing() + "\t" + s.getAuthor());
        }
        System.out.println("********************************************");
    }

    @When("I do nothing")
    public void iDoNothing() {

    }

    @Then("I expect to have the following books")
    public void iExpectToHaveTheFollowingBooks(List<Book> expectedBooks) {
        assertTrue(CollectionUtils.isEqualCollection(expectedBooks, actualBooks));
    }
}