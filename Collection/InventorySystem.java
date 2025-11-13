import java.util.*;

//  Product class
class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return name + " (₹" + price + ", stock=" + stock + ")";
    }
}

public class InventorySystem {
    public static void main(String[] args) {
        //  Set for unique product names
        Set<String> productNames = new HashSet<>();

        //  List for all product details
        List<Product> products = new ArrayList<>();

        //  Queue for products needing restock
        Queue<Product> restockQueue = new LinkedList<>();

        //  Stack for recently restocked products
        Stack<Product> restockedStack = new Stack<>();

        // Add new products (avoid duplicates)
        addProduct(productNames, products, new Product("Milk", 30.0, 5));
        addProduct(productNames, products, new Product("Bread", 25.0, 2));
        addProduct(productNames, products, new Product("Eggs", 60.0, 1));
        addProduct(productNames, products, new Product("Milk", 30.0, 5)); // Duplicate ignored

        System.out.println("\nAll Products:");
        for (Product p : products)
            System.out.println(p);

        //  Identify low-stock items (stock < 3)
        for (Product p : products) {
            if (p.stock < 3) {
                restockQueue.add(p);
            }
        }

        System.out.println("\n Products to Restock: " + restockQueue);

        //  Process restock queue
        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += 10; // restock with +10 units
            restockedStack.push(p);
            System.out.println("Restocked: " + p.name + " (new stock = " + p.stock + ")");
        }

        // Undo last restock operation
        if (!restockedStack.isEmpty()) {
            Product lastRestocked = restockedStack.pop();
            lastRestocked.stock -= 10;
            System.out.println("\n Undo last restock: " + lastRestocked.name + " (stock reverted to " + lastRestocked.stock + ")");
        }

        // Final inventory display
        System.out.println("\n Final Inventory:");
        for (Product p : products)
            System.out.println(p);
    }

    // Helper method to add product uniquely
    static void addProduct(Set<String> productNames, List<Product> products, Product p) {
        if (productNames.add(p.name)) {
            products.add(p);
        } else {
            System.out.println("Duplicate ignored: " + p.name);
        }
    }
}
