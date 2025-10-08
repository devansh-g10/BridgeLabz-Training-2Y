import java.util.ArrayList;
import java.util.List;

// Interface Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method for discount calculation
    public abstract double calculateDiscount();

    // Encapsulation with getter and setter
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to calculate final price (price + tax - discount)
    public void displayFinalPrice() {
        double tax = 0;
        if (this instanceof Taxable) {
            tax = ((Taxable) this).calculateTax();
        }
        double discount = calculateDiscount();
        double finalPrice = getPrice() + tax - discount;

        System.out.println(getName() + " - Price: $" + getPrice()
                + ", Tax: $" + tax
                + ", Discount: $" + discount
                + ", Final Price: $" + finalPrice);
    }
}

// Electronics class implements Taxable
class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // Electronics discount 10%
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        // Electronics tax 15%
        return getPrice() * 0.15;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax - 15%";
    }
}

// Clothing class implements Taxable
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // Clothing discount 20%
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        // Clothing tax 10%
        return getPrice() * 0.10;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax - 10%";
    }
}

// Groceries class does not implement Taxable (tax-exempt)
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        // Groceries discount 5%
        return getPrice() * 0.05;
    }
}

// Demo class to showcase polymorphism
public class Commerce {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 1000));
        products.add(new Clothing(2, "T-Shirt", 50));
        products.add(new Groceries(3, "Rice", 30));

        for (Product product : products) {
            product.displayFinalPrice();
        }
    }
}