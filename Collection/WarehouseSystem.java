import java.util.*;

class Package {
    String id;
    String name;
    Package(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return id + " - " + name;
    }
}

public class WarehouseSystem {
    public static void main(String[] args) {
        Queue<Package> pending = new LinkedList<>();
        Set<String> packageIDs = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();

        Package p1 = new Package("P01", "Phone");
        Package p2 = new Package("P02", "Laptop");
        Package p3 = new Package("P03", "Watch");

        // Add packages (ensure unique IDs)
        for (Package p : List.of(p1, p2, p3)) {
            if (packageIDs.add(p.id)) pending.add(p);
        }

        // Deliver packages
        while (!pending.isEmpty()) {
            Package p = pending.poll();
            System.out.println("Delivering: " + p);
            delivered.add(p);
        }

        // Return one package
        returned.push(p2);
        System.out.println("Returned Packages: " + returned);
        System.out.println("Delivered Packages: " + delivered);
    }
}
