import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> subjects = new HashMap<>();

        // Add subjects and student marks
        Map<String, Integer> math = new HashMap<>();
        math.put("Amit", 88);
        math.put("Neha", 95);
        math.put("Ravi", 76);
        subjects.put("Math", math);

        Map<String, Integer> science = new HashMap<>();
        science.put("Amit", 91);
        science.put("Neha", 85);
        science.put("Ravi", 93);
        subjects.put("Science", science);

        Map<String, Integer> english = new HashMap<>();
        english.put("Amit", 80);
        english.put("Neha", 89);
        english.put("Ravi", 90);
        subjects.put("English", english);

        // 1. Topper per subject
        System.out.println("Topper per Subject:");
        for (String subj : subjects.keySet()) {
            Map.Entry<String, Integer> topper = Collections.max(subjects.get(subj).entrySet(),
                    Map.Entry.comparingByValue());
            System.out.println(subj + ": " + topper.getKey() + " (" + topper.getValue() + ")");
        }

        // 2. Average per subject
        System.out.println("\nAverage per Subject:");
        for (String subj : subjects.keySet()) {
            double avg = subjects.get(subj).values().stream().mapToInt(Integer::intValue).average().orElse(0);
            System.out.println(subj + ": " + avg);
        }

        // 3. Subjects where someone scored >90
        System.out.println("\nSubjects with marks >90:");
        for (String subj : subjects.keySet()) {
            boolean hasHigh = subjects.get(subj).values().stream().anyMatch(v -> v > 90);
            if (hasHigh) System.out.println(subj);
        }
    }
}
