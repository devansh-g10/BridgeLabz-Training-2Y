import java.util.*;

// Base product class
abstract class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

// Different product categories
class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }
}

// Generic Seller class
class Seller<T extends Product> {
    String sellerName;
    List<T> products = new ArrayList<>();

    Seller(String sellerName) {
        this.sellerName = sellerName;
    }

    void addProduct(T product) {
        products.add(product);
    }

    List<T> getProducts() {
        return products;
    }

    void showProducts() {
        System.out.println("Seller: " + sellerName);
        for (T p : products) {
            System.out.println(" - " + p);
        }
    }
}

// Marketplace that accepts any type of product sellers
class Marketplace {
    static void showAllSellers(List<? extends Seller<? extends Product>> sellers) {
        for (Seller<? extends Product> s : sellers) {
            s.showProducts();
            System.out.println();
        }
    }
}

public class MarketplaceDemo {
    public static void main(String[] args) {
        Seller<Electronics> elecSeller = new Seller<>("TechWorld");
        elecSeller.addProduct(new Electronics("Laptop", 65000));
        elecSeller.addProduct(new Electronics("Smartphone", 30000));

        Seller<Clothing> clothSeller = new Seller<>("FashionHub");
        clothSeller.addProduct(new Clothing("T-Shirt", 999));
        clothSeller.addProduct(new Clothing("Jeans", 1999));

        List<Seller<? extends Product>> allSellers = Arrays.asList(elecSeller, clothSeller);

        System.out.println("=== Online Marketplace ===");
        Marketplace.showAllSellers(allSellers);
    }
}
