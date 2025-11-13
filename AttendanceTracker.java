import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        String[] students = {"Amit", "Neha", "Ravi", "Sita", "John"};

        for (String s : students) attendance.put(s, 0);

        // Simulate 15 days
        Random r = new Random();
        for (int day = 1; day <= 15; day++) {
            for (String s : students) {
                if (r.nextBoolean()) attendance.put(s, attendance.get(s) + 1);
            }
        }

        // Print low attendance
        System.out.println("Students with <10 days present:");
        attendance.entrySet().stream()
                .filter(e -> e.getValue() < 10)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
