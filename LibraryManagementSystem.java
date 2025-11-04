import java.util.*;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) { super(msg); }
}
class InvalidReturnException extends Exception {
    public InvalidReturnException(String msg) { super(msg); }
}
class UserLimitExceededException extends Exception {
    public UserLimitExceededException(String msg) { super(msg); }
}

public class LibraryManagementSystem {
    static Map<String, Boolean> books = new HashMap<>();
    static Map<String, List<String>> userBooks = new HashMap<>();

    static {
        books.put("Java", true);
        books.put("DBMS", true);
        books.put("Python", false);
    }

    public static void borrowBook(String user, String book)
            throws BookNotAvailableException, UserLimitExceededException {
        userBooks.putIfAbsent(user, new ArrayList<>());
        if (!books.containsKey(book) || !books.get(book))
            throw new BookNotAvailableException(book + " is not available right now!");
        if (userBooks.get(user).size() >= 5)
            throw new UserLimitExceededException("Borrow limit exceeded (max 5 books).");

        books.put(book, false);
        userBooks.get(user).add(book);
        System.out.println(user + " borrowed: " + book);
    }

    public static void returnBook(String user, String book) throws InvalidReturnException {
        if (!userBooks.containsKey(user) || !userBooks.get(user).contains(book))
            throw new InvalidReturnException("Book not borrowed by this user!");
        books.put(book, true);
        userBooks.get(user).remove(book);
        System.out.println("Returned: " + book);
    }

    public static void main(String[] args) {
        try {
            borrowBook("Devansh", "Python");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
