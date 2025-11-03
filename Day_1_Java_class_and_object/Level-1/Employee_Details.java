import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class Employee_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        // Creating object with user input
        Employee emp = new Employee(name, id, salary);

        System.out.println("\n=== Employee Details ===");
        emp.displayDetails();

        sc.close();
    }
}
