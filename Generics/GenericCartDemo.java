import java.util.*;

class Cart<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
        System.out.println(item + " added to cart.");
    }

    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println(item + " removed from cart.");
        } else {
            System.out.println(item + " not found in cart.");
        }
    }

    public void displayItems() {
        System.out.println("Cart Items:");
        for (T item : items) {
            System.out.println(" - " + item);
        }
    }
}

// Product classes
class Electronics {
    String name;
    Electronics(String name) { this.name = name; }

    @Override
    public String toString() { return name + " (Electronics)"; }
}

class Clothing {
    String name;
    Clothing(String name) { this.name = name; }

    @Override
    public String toString() { return name + " (Clothing)"; }
}

public class GenericCartDemo {
    public static void main(String[] args) {
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.addItem(new Electronics("Smartphone"));

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("T-Shirt"));
        clothingCart.addItem(new Clothing("Jeans"));

        System.out.println("\nElectronics Cart:");
        electronicsCart.displayItems();

        System.out.println("\nClothing Cart:");
        clothingCart.displayItems();
    }
}
