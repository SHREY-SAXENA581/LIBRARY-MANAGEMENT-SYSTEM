import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String ISBN = sc.nextLine();
                    Book book = new Book(title, author, ISBN);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to delete: ");
                    String deleteISBN = sc.nextLine();
                    library.deleteBook(deleteISBN);
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine();
                    library.searchBook(searchTitle);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
