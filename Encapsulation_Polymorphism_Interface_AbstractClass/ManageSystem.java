// Interface Reservable
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class LibraryItem
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrowerName;
    private boolean isReserved;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    // Abstract method to get loan duration (in days)
    public abstract int getLoanDuration();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Status: " + (isReserved ? "Reserved by " + borrowerName : "Available"));
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }

    // Encapsulation getters/setters for borrowerName and isReserved
    public String getBorrowerName() {
        return borrowerName;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public boolean isReserved() {
        return isReserved;
    }

    protected void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    protected abstract void reserveItem(String string);
}

// Book subclass
class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 21; // 3 weeks loan duration for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrowerName(borrowerName);
            setReserved(true);
            System.out.println("Book reserved successfully for " + borrowerName);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Magazine subclass
class Magazine extends LibraryItem implements Reservable {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week loan duration for magazines
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrowerName(borrowerName);
            setReserved(true);
            System.out.println("Magazine reserved successfully for " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// DVD subclass
class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks loan duration for DVDs
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved()) {
            setBorrowerName(borrowerName);
            setReserved(true);
            System.out.println("DVD reserved successfully for " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved();
    }
}

// Demo class showing polymorphism
public class ManageSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        book.getItemDetails();
        book.reserveItem("Alice");
        book.getItemDetails();

        System.out.println();

        magazine.getItemDetails();
        magazine.reserveItem("Bob");
        magazine.getItemDetails();

        System.out.println();

        dvd.getItemDetails();
        dvd.reserveItem("Charlie");
        dvd.getItemDetails();
    }
}