import java.time.LocalDate;

// Base class Order
class Order {
    private String orderId;
    private LocalDate orderDate;

    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}

// Subclass ShippedOrder extends Order
class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }
}

// Subclass DeliveredOrder extends ShippedOrder
class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}

// Demo class
public class Online {
    public static void main(String[] args) {
        Order order = new Order("ORD123", LocalDate.of(2025, 9, 22));
        System.out.println(order.getOrderStatus());

        ShippedOrder shippedOrder = new ShippedOrder("ORD124", LocalDate.of(2025, 9, 20), "TRACK123");
        System.out.println(shippedOrder.getOrderStatus());

        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", LocalDate.of(2025, 9, 18), "TRACK456", LocalDate.of(2025, 9, 21));
        System.out.println(deliveredOrder.getOrderStatus());
    }
}