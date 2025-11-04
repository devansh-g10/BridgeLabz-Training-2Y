public class StudentGradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85"};

        for (String grade : grades) {
            try {
                int num = Integer.parseInt(grade);
                System.out.println("Valid grade: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}
