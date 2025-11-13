import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();

        // 1. Add students and grades
        grades.put("Amit", 85.5);
        grades.put("Neha", 92.0);
        grades.put("Ravi", 78.0);

        // 2. Update grade (Ravi retakes test)
        grades.put("Ravi", 88.0);

        // 3. Remove student who dropped out
        grades.remove("Amit");

        // 4. Print sorted by name
        System.out.println("Student Grades (Alphabetical):");
        grades.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
