import java.util.ArrayList;
import java.util.List;

class Library {
    List<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Delete a book by ISBN
    public void deleteBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                books.remove(book);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Search for a book by title
    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.displayBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            book.displayBook();
        }
    }
}
