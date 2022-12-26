import java.util.ArrayList;
import java.util.List;

public class Reader {
    private final String fullName;
    private final int READER_ID;
    private String faculty;
    private final String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, Integer readerId, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.READER_ID = readerId;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int bookCount) {
        System.out.printf("%s взял %s книги.\n", this.fullName, bookCount);
    }

    public void takeBook(String... books) {
        System.out.printf("%s взял книги: %s.\n", this.fullName, String.join(", ", books));
    }

    public void takeBook(Book... books) {
        List<String> bookTitles = new ArrayList<>();
        for (Book book : books) {
            bookTitles.add(book.getBookTitle());
        }
        System.out.printf("%s взял книги: %s.\n", this.fullName, String.join(", ", bookTitles));
    }

    public void returnBook(int bookCount) {
        System.out.printf("%s вернул %s книги.\n", this.fullName, bookCount);
    }

    public void returnBook(String... books) {
        System.out.printf("%s вернул книги: %s.\n", this.fullName, String.join(", ", books));
    }

    public void returnBook(Book... books) {
        List<String> bookTitles = new ArrayList<>();
        for (Book book : books) {
            bookTitles.add(book.getBookTitle());
        }
        System.out.printf("%s вернул книги: %s.\n", this.fullName, String.join(", ", bookTitles));
    }
}