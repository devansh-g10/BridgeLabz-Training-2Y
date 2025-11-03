class Book {
    static String libraryName = "City Library";
    private String title;
    private String author;
    private final String isbn;  // final unique identifier

    // Constructor with 'this'
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayBook() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }
}

public class Library_management_system {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN101");
        b1.displayBook();
    }
}
