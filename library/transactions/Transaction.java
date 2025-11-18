package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void issueBook(Book book, Member member) {
        if (!book.isIssued()) {
            book.issue();
            System.out.println("Book \"" + book.getTitle() + "\" issued to " + member.getName());
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is already issued.");
        }
    }
}
