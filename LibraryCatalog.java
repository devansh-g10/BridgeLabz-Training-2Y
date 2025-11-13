import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();

        // Add books
        books.put("978-1111111111", "Java Basics");
        books.put("978-2222222222", "Data Structures");
        books.put("978-3333333333", "Algorithms");

        // Search by ISBN
        String isbn = "978-1111111111";
        System.out.println("Book: " + books.getOrDefault(isbn, "Book not found"));

        // Remove a book
        books.remove("978-2222222222");

        // Print sorted by ISBN
        System.out.println("\nBooks (Sorted by ISBN):");
        books.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        // Search by title
        String searchTitle = "Algorithms";
        boolean found = false;
        for (Map.Entry<String, String> entry : books.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(searchTitle)) {
                System.out.println("\nFound: " + entry.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("\nBook not found by title.");
    }
}
