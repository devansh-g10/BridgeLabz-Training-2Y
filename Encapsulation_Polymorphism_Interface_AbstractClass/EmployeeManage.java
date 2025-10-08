import java.util.ArrayList;
import java.util.List;

// Interface Department
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    private String department; // For department assignment

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + department);
        System.out.println("Calculated Salary: " + calculateSalary());
    }

    // Getters and setters for encapsulation
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee implements Department {

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // Full-time employees get fixed base salary
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String deptName) {
        setDepartment(deptName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Full-Time Employee Department: " + (getDepartmentDetails() != null ? getDepartmentDetails() : "Not assigned");
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        // Calculate salary based on hours worked and hourly rate
        return workHours * hourlyRate;
    }

    @Override
    public void assignDepartment(String deptName) {
        setDepartment(deptName);
    }

    @Override
    public String getDepartmentDetails() {
        return "Part-Time Employee Department: " + (getDepartmentDetails() != null ? getDepartmentDetails() : "Not assigned");
    }

    // Getters and setters for workHours and hourlyRate
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int hours) {
        this.workHours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double rate) {
        this.hourlyRate = rate;
    }
}

// Main class demonstrating polymorphism and employee management
public class EmployeeManage {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee ftEmp = new FullTimeEmployee(101, "Alice", 50000);
        ftEmp.assignDepartment("HR");

        PartTimeEmployee ptEmp = new PartTimeEmployee(102, "Bob", 0, 120, 20);
        ptEmp.assignDepartment("Sales");

        employees.add(ftEmp);
        employees.add(ptEmp);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
}