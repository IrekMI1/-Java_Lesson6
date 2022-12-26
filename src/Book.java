public class Book {
    private final String bookTitle;
    private final String author;

    public Book(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }
}