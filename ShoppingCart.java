import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();

        // 1. Add products
        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 700.0);
        cart.put("Keyboard", 1200.0);
        cart.put("Headphones", 2500.0);

        // 2. Display in order added
        System.out.println("Products in Cart (order added):");
        cart.forEach((k, v) -> System.out.println(k + ": ₹" + v));

        // 3. Calculate total & discount
        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();
        if (total > 5000)
            total *= 0.9; // 10% discount
        System.out.println("\nTotal after discount (if any): ₹" + total);

        // 4. Remove product (simulate user removing)
        cart.remove("Mouse");
        System.out.println("\nAfter removing Mouse:");
        cart.forEach((k, v) -> System.out.println(k + ": ₹" + v));
    }
}
