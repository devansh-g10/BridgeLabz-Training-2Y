import java.util.*;

// Base class for warehouse items
abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) { this.name = name; }

    @Override
    public String toString() {
        return name + " (" + getClass().getSimpleName() + ")";
    }
}

// Different types of items
class Electronics extends WarehouseItem {
    Electronics(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    Groceries(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    Furniture(String name) { super(name); }
}

// Generic storage class
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void showItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

// Wildcard method
class WarehouseUtils {
    public static void displayAll(List<? extends WarehouseItem> items) {
        System.out.println("Displaying all warehouse items:");
        for (WarehouseItem item : items) {
            System.out.println(" - " + item);
        }
    }
}

public class SmartWarehouseDemo {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("TV"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Oil"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics Storage:");
        electronicsStorage.showItems();

        System.out.println("\nAll Items (using wildcard):");
        WarehouseUtils.displayAll(electronicsStorage.getItems());
        WarehouseUtils.displayAll(groceriesStorage.getItems());
        WarehouseUtils.displayAll(furnitureStorage.getItems());
    }
}
