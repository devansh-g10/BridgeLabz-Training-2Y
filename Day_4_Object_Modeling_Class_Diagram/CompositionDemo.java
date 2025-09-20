import java.util.*;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
    void show() { System.out.println("Employee: " + name); }
}

class Department {
    String deptName;
    List<Employee> employees = new ArrayList<>();

    Department(String deptName) { this.deptName = deptName; }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void show() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) e.show();
    }
}

class Company {
    String compName;
    List<Department> depts = new ArrayList<>();

    Company(String compName) { this.compName = compName; }

    void addDept(Department d) { depts.add(d); }

    void show() {
        System.out.println("Company: " + compName);
        for (Department d : depts) d.show();
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Company c1 = new Company("TechCorp");
        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Aman"));
        d1.addEmployee(new Employee("Ravi"));
        c1.addDept(d1);

        c1.show();  // agar Company delete ho gayi → Departments aur Employees bhi gayab
    }
}
