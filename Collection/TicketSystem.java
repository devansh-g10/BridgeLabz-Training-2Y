import java.util.*;

class Booking implements Comparable<Booking> {
    String user;
    boolean isVIP;
    Booking(String user, boolean isVIP) {
        this.user = user;
        this.isVIP = isVIP;
    }
    public int compareTo(Booking b) {
        return Boolean.compare(b.isVIP, this.isVIP);
    }
    public String toString() {
        return user + (isVIP ? " (VIP)" : "");
    }
}

public class TicketSystem {
    public static void main(String[] args) {
        Set<String> users = new HashSet<>();
        PriorityQueue<Booking> pq = new PriorityQueue<>();
        List<Booking> confirmed = new ArrayList<>();

        Booking b1 = new Booking("Ravi", false);
        Booking b2 = new Booking("Amit", true);
        Booking b3 = new Booking("Sara", false);

        for (Booking b : List.of(b1, b2, b3)) {
            if (users.add(b.user)) pq.add(b);
        }

        while (!pq.isEmpty()) {
            Booking b = pq.poll();
            confirmed.add(b);
            System.out.println("Confirmed: " + b);
        }
    }
}
