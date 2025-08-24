import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Years of Service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("No Bonus");
        }
    }
}
