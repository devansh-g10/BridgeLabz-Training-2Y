import java.util.*;

// Class for ride request
class RideRequest implements Comparable<RideRequest> {
    String customerName;
    int priority; // Higher = more urgent

    public RideRequest(String customerName, int priority) {
        this.customerName = customerName;
        this.priority = priority;
    }

    // Compare based on priority (descending)
    public int compareTo(RideRequest other) {
        return other.priority - this.priority;
    }

    public String toString() {
        return customerName + " (Priority: " + priority + ")";
    }
}

// Class for driver
class Driver {
    String name;
    public Driver(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

// Class for completed ride
class Ride {
    String customerName;
    String driverName;

    public Ride(String customerName, String driverName) {
        this.customerName = customerName;
        this.driverName = driverName;
    }

    public String toString() {
        return "Ride: " + customerName + " with " + driverName;
    }
}

public class RideSharingSystem {
    public static void main(String[] args) {
        // ✅ PriorityQueue for urgent requests
        PriorityQueue<RideRequest> rideQueue = new PriorityQueue<>();

        // ✅ Set of available drivers (unique)
        Set<Driver> driverSet = new HashSet<>();
        driverSet.add(new Driver("Ravi"));
        driverSet.add(new Driver("Sneha"));
        driverSet.add(new Driver("Amit"));

        // ✅ List for completed rides
        List<Ride> completedRides = new ArrayList<>();

        // ✅ Add ride requests
        rideQueue.add(new RideRequest("Alice", 5));
        rideQueue.add(new RideRequest("Bob", 3));
        rideQueue.add(new RideRequest("Charlie", 8));

        System.out.println("Incoming Ride Requests (by priority): " + rideQueue);

        // ✅ Assign rides
        Iterator<Driver> driverIterator = driverSet.iterator();
        while (!rideQueue.isEmpty() && driverIterator.hasNext()) {
            RideRequest req = rideQueue.poll(); // highest priority first
            Driver drv = driverIterator.next();
            System.out.println("\nAssigning " + req + " to driver " + drv);
            completedRides.add(new Ride(req.customerName, drv.name));
        }

        // ✅ Show completed rides
        System.out.println("\nCompleted Rides:");
        for (Ride r : completedRides) {
            System.out.println(r);
        }
    }
}
