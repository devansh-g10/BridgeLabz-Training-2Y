import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            physics[i] = sc.nextDouble();
            chemistry[i] = sc.nextDouble();
            maths[i] = sc.nextDouble();

            double total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                               " | Physics: " + physics[i] +
                               " | Chemistry: " + chemistry[i] +
                               " | Maths: " + maths[i] +
                               " | Percentage: " + percentage[i] +
                               " | Grade: " + grade[i]);
        }
    }
}
