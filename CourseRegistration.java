import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 45);
        courses.put("CS102", 5);
        courses.put("CS103", 52);
        courses.put("CS104", 3);
        courses.put("CS105", 60);

        // Add/Drop students
        courses.put("CS102", courses.get("CS102") + 10);
        courses.put("CS104", Math.max(0, courses.get("CS104") - 2));

        // Print near full & under-subscribed
        System.out.println("Near full (≥50):");
        courses.entrySet().stream().filter(e -> e.getValue() >= 50)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        System.out.println("\nUnder-subscribed (<5):");
        courses.entrySet().stream().filter(e -> e.getValue() < 5)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
