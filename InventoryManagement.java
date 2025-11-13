import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        // 1. Add products
        inventory.put("Apples", 50);
        inventory.put("Bananas", 20);
        inventory.put("Oranges", 10);

        // 2. Customer buys (reduce quantity)
        inventory.put("Apples", inventory.get("Apples") - 45);
        if (inventory.get("Apples") <= 0) inventory.put("Apples", 0);

        // 3. New shipment
        inventory.put("Bananas", inventory.get("Bananas") + 30);

        // 4. Query
        String query = "Oranges";
        if (inventory.containsKey(query))
            System.out.println(query + " in stock: " + inventory.get(query));
        else
            System.out.println(query + " not stocked.");

        // 5. Out of stock items
        System.out.println("\nOut of stock items:");
        inventory.entrySet().stream()
                .filter(e -> e.getValue() == 0)
                .forEach(e -> System.out.println(e.getKey()));
    }
}
