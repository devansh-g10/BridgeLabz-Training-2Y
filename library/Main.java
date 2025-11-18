import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        Member member1 = new Member("Rahul Sharma", 101);
        Transaction transaction = new Transaction();

        System.out.println("---- Adding a New Book ----");
        book1.displayBookDetails();

        System.out.println("\n---- Registering a New Member ----");
        member1.displayMemberDetails();

        System.out.println("\n---- Issuing a Book ----");
        transaction.issueBook(book1, member1);
    }
}
