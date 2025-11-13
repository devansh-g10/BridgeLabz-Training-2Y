import java.util.*;

class Book {
    String title;
    Book(String title) { this.title = title; }
    public String toString() { return title; }
}

public class LibrarySystem {
    public static void main(String[] args) {
        List<Book> books = List.of(new Book("Java"), new Book("Python"), new Book("C++"));
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returned = new Stack<>();

        members.add("M01");
        issueQueue.add(books.get(0));
        issueQueue.add(books.get(1));

        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.poll();
            System.out.println("Issued: " + b);
            returned.push(b);
        }

        System.out.println("Reissuing last returned: " + returned.pop());
    }
}
