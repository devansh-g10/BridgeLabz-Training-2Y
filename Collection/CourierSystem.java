import java.util.*;

class Parcel implements Comparable<Parcel> {
    String id;
    int priority;
    Parcel(String id, int priority) {
        this.id = id; this.priority = priority;
    }
    public int compareTo(Parcel p) {
        return Integer.compare(p.priority, this.priority);
    }
    public String toString() { return id + "(P=" + priority + ")"; }
}

public class CourierSystem {
    public static void main(String[] args) {
        PriorityQueue<Parcel> pq = new PriorityQueue<>();
        Set<String> ids = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();

        Parcel p1 = new Parcel("C1", 3);
        Parcel p2 = new Parcel("C2", 5);
        Parcel p3 = new Parcel("C3", 2);

        for (Parcel p : List.of(p1, p2, p3)) {
            if (ids.add(p.id)) pq.add(p);
        }

        while (!pq.isEmpty()) {
            Parcel p = pq.poll();
            System.out.println("Delivering: " + p);
            completed.add(p);
        }
    }
}
