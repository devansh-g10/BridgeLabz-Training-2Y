import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        String[] marks = {"85", "95", "null", "88", "abc"};
        ArrayList<Integer> validMarks = new ArrayList<>();

        for (String m : marks) {
            try {
                if (!m.equals("null"))
                    validMarks.add(Integer.parseInt(m));
            } catch (Exception e) {
                // ignore invalid
            }
        }

        double avg = validMarks.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);

        System.out.println("Average Marks: " + avg);
    }
}
