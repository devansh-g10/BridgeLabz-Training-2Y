interface PaymentProcessor {
    void pay(double amount);
    
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated.");
    }
}

class Paytm implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Paytm");
    }
}
