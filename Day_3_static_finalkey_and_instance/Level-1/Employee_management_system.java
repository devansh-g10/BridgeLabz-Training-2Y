class Employee {
    static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private String name;
    private final int id;  // final
    private String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployee() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName +
                    ", Name: " + name +
                    ", ID: " + id +
                    ", Designation: " + designation);
        }
    }
}

public class Employee_management_system {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", 1, "Developer");
        Employee e2 = new Employee("Simran", 2, "Manager");

        e1.displayEmployee();
        e2.displayEmployee();
        Employee.displayTotalEmployees();
    }
}
