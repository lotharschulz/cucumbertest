package info.lotharschulz.cucumber.test;

public class Book {

    private String title;
    private int pages;
    private String isbnNumber;

    public Book(String title, int pages, String isbnNumber) {
        this.title = title;
        this.pages = pages;
        this.isbnNumber = isbnNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public String toString() {
        return "| " + title +
                " | " + pages +
                " | " + isbnNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book that = (Book) o;

        if (pages != that.pages) return false;
        if (isbnNumber != null ? !isbnNumber.equals(that.isbnNumber) : that.isbnNumber != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + pages;
        result = 31 * result + (isbnNumber != null ? isbnNumber.hashCode() : 0);
        return result;
    }
}
