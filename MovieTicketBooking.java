import java.util.*;

class InvalidSeatException extends Exception {
    public InvalidSeatException(String msg) { super(msg); }
}
class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String msg) { super(msg); }
}

public class MovieTicketBooking {
    static Map<Integer, Boolean> seats = new HashMap<>();

    static {
        for (int i = 1; i <= 5; i++) seats.put(i, false);
    }

    public static void bookSeat(int seatNo)
            throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo))
            throw new InvalidSeatException("Seat number " + seatNo + " doesn’t exist.");
        if (seats.get(seatNo))
            throw new SeatAlreadyBookedException("Seat " + seatNo + " already booked!");
        seats.put(seatNo, true);
        System.out.println("Seat " + seatNo + " booked successfully!");
    }

    public static void main(String[] args) {
        try {
            bookSeat(2);
            bookSeat(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
