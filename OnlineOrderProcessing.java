import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) { super(msg); }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) { super(msg); }
}

public class OnlineOrderProcessing {
    public static void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random r = new Random();
        int choice = r.nextInt(2);
        if (choice == 0)
            throw new OutOfStockException("Product is out of stock!");
        else
            throw new PaymentFailedException("Payment failed! Please try again.");
    }

    public static void main(String[] args) {
        try {
            placeOrder();
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
