import java.util.*;
import java.io.Serializable;

public class Library implements Serializable {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book searchBook(int id) {
        for (Book b : books) {
            if (b.getId() == id)
                return b;
        }
        return null;
    }

    public boolean issueBook(int id) {
        Book b = searchBook(id);
        if (b != null && !b.isIssued()) {
            b.issue();
            return true;
        }
        return false;
    }

    public boolean returnBook(int id) {
        Book b = searchBook(id);
        if (b != null && b.isIssued()) {
            b.returnBook();
            return true;
        }
        return false;
    }
}
