package info.lotharschulz.cucumber.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookListStepdefs {
    private final MyBooks myBooks = new MyBooks();
    private StringBuilder printedList;

    @Given("^a book list:$")
    public void a_book_list(List<ShoppingItem> items) throws Throwable {
        for (ShoppingItem item : items) {
            myBooks.addBook(item.key, item.title, item.pages, item.isbnNumber);
        }
    }

    @When("^I print that list$")
    public void I_print_that_list() throws Throwable {
        printedList = new StringBuilder();
        myBooks.print(printedList);
    }

    @Then("^it should look like:$")
    public void it_should_look_like(String expected) throws Throwable {
        assertEquals(expected, printedList.toString());
    }

    public static class ShoppingItem {
        private String key;
        private String title;
        private Integer pages;
        private String isbnNumber;
    }

}
