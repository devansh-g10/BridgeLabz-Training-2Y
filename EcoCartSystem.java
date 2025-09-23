import java.util.*;

// -------------------- 1. Abstract Class Product --------------------
abstract class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters & Setters (Encapsulation)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Abstract Method
    public abstract double getDiscountedPrice();

    // Concrete Method
    public void displayProductInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Discounted Price: " + getDiscountedPrice());
    }

    // equals() → same if IDs are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return this.id == other.id;
    }
}

// -------------------- 2. Subclasses --------------------
class OrganicProduct extends Product {
    public OrganicProduct(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.90; // 10% discount
    }

    @Override
    public String toString() {
        return "Product ID: " + getId() + ", Name: " + getName() +
                ", Base Price: " + getPrice() +
                ", Discounted Price: " + getDiscountedPrice();
    }
}

class RecycledProduct extends Product {
    public RecycledProduct(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.95; // 5% discount
    }

    @Override
    public String toString() {
        return "Product ID: " + getId() + ", Name: " + getName() +
                ", Base Price: " + getPrice() +
                ", Discounted Price: " + getDiscountedPrice();
    }
}

// -------------------- 3, 5 & 6. Cart Class --------------------
class Cart {
    private List<Product> products = new ArrayList<>();
    private static int totalCartsCreated = 0;
    public static final double TAX_RATE = 0.05;

    // Constructor
    public Cart() {
        totalCartsCreated++;
    }

    // 3. Overloaded addItem()
    public void addItem(Product p) {
        products.add(p);
        System.out.println("Added Product: " + p.getName());
    }

    public void addItem(Product... items) {
        for (Product p : items) {
            products.add(p);
            System.out.println("Added Product: " + p.getName());
        }
    }

    public void addItem(int productId, int quantity) {
        System.out.println("Added " + quantity + " units of Product ID " + productId);
    }

    // 5. Static + Non-Static Methods
    public static int getCartCount() {
        return totalCartsCreated;
    }

    public void printCartItems() {
        System.out.println("Items in Cart:");
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }

    // 6. Final methods
    public final void printBillHeader() {
        System.out.println("******* EcoCart Bill ********");
    }

    public void printBill() {
        printBillHeader();
        double grandTotal = 0.0;
        for (Product p : products) {
            double price = p.getDiscountedPrice();
            double tax = price * TAX_RATE;
            double total = price + tax;
            grandTotal += total;
            System.out.println("Item: " + p.getName() +
                    ", Price: " + price +
                    ", Tax: " + tax +
                    ", Total: " + total);
        }
        System.out.println("----------------------------");
        System.out.println("Grand Total: " + grandTotal);
    }
}

// -------------------- 6. Final EcoRules Class --------------------
final class EcoRules {
    public static void showRules() {
        System.out.println("Use eco-friendly bags.");
        System.out.println("Recycle waste responsibly.");
    }
}

// -------------------- Main Class --------------------
public class EcoCartSystem {
    public static void main(String[] args) {

        // Creating Products
        Product p1 = new OrganicProduct(101, "Organic Apple", 100);
        Product p2 = new RecycledProduct(201, "Recycled Notebook", 200);
        Product p3 = new OrganicProduct(102, "Organic Banana", 50);

        System.out.println("1. Displaying Product Info (Using displayProductInfo)");
        p1.displayProductInfo();
        p2.displayProductInfo();
        p3.displayProductInfo();

        System.out.println("\n2. Adding Products to Cart");

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        cart1.addItem(p1);
        cart1.addItem(p2, p3);
        cart1.addItem(101, 3);

        System.out.println("\n3. Printing Cart Items (printCartItems)");
        cart1.printCartItems();

        System.out.println("\n4. Using Static Method (Cart.getCartCount())");
        System.out.println("Total carts created: " + Cart.getCartCount());

        System.out.println("\n5. Printing Bill (Using TAX_RATE)");
        cart1.printBill();

        System.out.println("\n6. Using EcoRules Class");
        EcoRules.showRules();
    }
}

