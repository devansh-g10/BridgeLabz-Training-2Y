class Product {
    static double discount = 10.0; // shared discount %
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProduct() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID +
                    ", Name: " + productName +
                    ", Price: " + price +
                    ", Qty: " + quantity +
                    ", Discount: " + discount + "%");
        }
    }
}

public class Shopping_cart_system {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 55000, 2);
        Product p2 = new Product(102, "Phone", 30000, 1);

        p1.displayProduct();
        p2.displayProduct();

        Product.updateDiscount(15.0);
        p1.displayProduct();
    }
}
