
// Single-type import
import company.hr.Employee;

// On-demand import
import company.payroll.*;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Priya Sharma", "Finance", 50000);
        Payroll payroll = new Payroll();

        System.out.println("---- Employee Details ----");
        emp.displayEmployeeDetails();

        System.out.println("\n---- Calculating Bonus ----");
        payroll.calculateBonus(emp);

        System.out.println("\n---- Final Employee Details ----");
        emp.displayEmployeeDetails();
    }
}
