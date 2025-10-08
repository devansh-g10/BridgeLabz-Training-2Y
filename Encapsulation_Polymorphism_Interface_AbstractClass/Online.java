// Interface Discountable

import java.util.ArrayList;
import java.util.List;

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    protected double discountAmount = 0;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount Applied: $" + discountAmount);
        System.out.println("Total Price: $" + calculateTotalPrice());
    }

    // Encapsulation: getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

// VegItem subclass
class VegItem extends FoodItem implements Discountable {

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - discountAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discountAmount = getPrice() * getQuantity() * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "VegItem Discount: $" + discountAmount;
    }
}

// NonVegItem subclass
class NonVegItem extends FoodItem implements Discountable {
    private double nonVegCharge = 2.5; // extra charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + nonVegCharge) * getQuantity();
        return total - discountAmount;
    }

    @Override
    public void applyDiscount(double percentage) {
        discountAmount = (getPrice() + nonVegCharge) * getQuantity() * (percentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "NonVegItem Discount: $" + discountAmount;
    }
}

// Demo class to show polymorphic handling of food items
public class Online {
    public static void processOrder(List<FoodItem> order) {
        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        VegItem vegPizza = new VegItem("Veg Pizza", 10.0, 2);
        vegPizza.applyDiscount(10); // 10% discount

        NonVegItem chickenBurger = new NonVegItem("Chicken Burger", 8.0, 1);
        chickenBurger.applyDiscount(5); // 5% discount

        order.add(vegPizza);
        order.add(chickenBurger);

        processOrder(order);
    }
}