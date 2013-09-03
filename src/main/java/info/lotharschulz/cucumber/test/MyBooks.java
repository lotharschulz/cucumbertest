package info.lotharschulz.cucumber.test;


import java.io.IOException;
import java.util.*;

public class MyBooks {

    private Map<String, Book> myBookShelf = new HashMap<String, Book>();

    public void addBook(String key, String name, int count, String itemNumber) {
        this.addBook(key, new Book(name, count, itemNumber));
    }

    private void addBook(String key, Book book) {
        myBookShelf.put(key, book);
    }

    public void print(Appendable out) throws IOException {
        for (Map.Entry<String, Book> entry : myBookShelf.entrySet()) {
            out.append("| ")
                    .append(entry.getKey())
                    .append(" | ")
                    .append(entry.getValue().getTitle())
                    .append(" | ")
                    .append(new Integer(entry.getValue().getPages()).toString())
                    .append(" | ")
                    .append(entry.getValue().getIsbnNumber())
                    .append(" |")
                    .append("\n");
        }
    }

    @Override
    public String toString() {
        return "MyBookss{" +
                "myBookShelf=" + myBookShelf +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyBooks)) return false;

        MyBooks myBooks = (MyBooks) o;

        if (!myBookShelf.equals(myBooks.myBookShelf)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return myBookShelf.hashCode();
    }


}