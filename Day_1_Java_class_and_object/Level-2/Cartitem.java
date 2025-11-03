import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        cart.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    void displayTotal() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cart Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Shirt", 1200, 2));
        cart.addItem(new CartItem("Jeans", 2000, 1));
        cart.displayTotal();
        cart.removeItem("Shirt");
        cart.displayTotal();
    }
}
