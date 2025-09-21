import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker svc = new StudentVoteChecker();

        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int i = 0; i < ages.length; i++) {
            if (svc.canStudentVote(ages[i]))
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " CAN vote.");
            else
                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " CANNOT vote.");
        }
    }
}
