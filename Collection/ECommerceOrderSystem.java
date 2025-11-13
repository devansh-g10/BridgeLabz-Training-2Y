import java.util.*;

// Class representing an order
class Order {
    int orderId;
    String customerName;
    double amount;

    Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    // For HashSet uniqueness check (based on orderId)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public String toString() {
        return "Order[ID=" + orderId + ", Name=" + customerName + ", Amount=" + amount + "]";
    }
}

public class ECommerceOrderSystem {

    public static void main(String[] args) {
        // 1️⃣ Step 1: Add orders (List)
        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order(101, "Alice", 1200));
        allOrders.add(new Order(102, "Bob", 850));
        allOrders.add(new Order(103, "Charlie", 650));
        allOrders.add(new Order(101, "Alice", 1200)); // Duplicate order

        System.out.println("🧾 All Orders (including duplicates):");
        allOrders.forEach(System.out::println);

        // 2️⃣ Step 2: Remove duplicates (Set)
        Set<Order> uniqueOrders = new HashSet<>(allOrders);

        System.out.println("\n✅ Unique Orders (after removing duplicates):");
        uniqueOrders.forEach(System.out::println);

        // 3️⃣ Step 3: Process orders using a Queue
        Queue<Order> orderQueue = new LinkedList<>(uniqueOrders);
        Stack<Order> failedOrders = new Stack<>();

        System.out.println("\n🚚 Processing Orders...");
        while (!orderQueue.isEmpty()) {
            Order current = orderQueue.remove();
            System.out.println("Processing: " + current);

            // Simulate random failure
            if (current.orderId % 2 == 0) {
                System.out.println("❌ Order failed: " + current);
                failedOrders.push(current);
            } else {
                System.out.println("✅ Order completed: " + current);
            }
        }

        // 4️⃣ Step 4: Retry failed orders using Stack (LIFO)
        System.out.println("\n🔁 Retrying Failed Orders...");
        while (!failedOrders.isEmpty()) {
            Order failed = failedOrders.pop();
            System.out.println("Retrying: " + failed);
            System.out.println("✅ Retry successful for: " + failed);
        }

        System.out.println("\n🎉 All orders processed successfully!");
    }
}
