import java.util.*;

class Patient {
    String name;
    Patient(String name) { this.name = name; }
    public String toString() { return name; }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Set<String> admitted = new HashSet<>();
        Queue<Patient> queue = new LinkedList<>();
        Stack<Patient> discharged = new Stack<>();
        List<Patient> history = new ArrayList<>();

        Patient p1 = new Patient("John");
        Patient p2 = new Patient("Alice");
        Patient p3 = new Patient("Bob");

        for (Patient p : List.of(p1, p2, p3)) {
            if (admitted.add(p.name)) queue.add(p);
        }

        while (!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println("Treating: " + p);
            discharged.push(p);
            history.add(p);
        }

        System.out.println("Recently Discharged: " + discharged.peek());
        System.out.println("Total History: " + history);
    }
}
