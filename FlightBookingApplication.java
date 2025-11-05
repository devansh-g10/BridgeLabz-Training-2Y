class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String msg) { super(msg); }
}
class PaymentFailedException2 extends Exception {
    public PaymentFailedException2(String msg) { super(msg); }
}

public class FlightBookingApplication {

    public static void checkSeatAvailability() throws SeatUnavailableException {
        throw new SeatUnavailableException("Selected seat is unavailable!");
    }

    public static void processPayment() throws PaymentFailedException2 {
        throw new PaymentFailedException2("Payment could not be processed!");
    }

    public static void bookTicket() throws Exception {
        checkSeatAvailability();
        processPayment();
    }

    public static void main(String[] args) {
        try {
            bookTicket();
        } catch (SeatUnavailableException e) {
            System.out.println("Booking Error: " + e.getMessage());
        } catch (PaymentFailedException2 e) {
            System.out.println("Payment Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
