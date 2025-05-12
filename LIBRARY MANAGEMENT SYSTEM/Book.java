class Book {
    String title;
    String author;
    String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }
}
