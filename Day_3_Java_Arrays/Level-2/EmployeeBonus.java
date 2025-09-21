import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ":");
            double s = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ":");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Enter again.");
                i--; // retry this employee
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        // Calculate bonus and totals
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = 0.05 * salary[i];
            } else {
                bonus[i] = 0.02 * salary[i];
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Employee Bonus Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                               " | Old Salary: " + salary[i] +
                               " | Bonus: " + bonus[i] +
                               " | New Salary: " + newSalary[i]);
        }
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
