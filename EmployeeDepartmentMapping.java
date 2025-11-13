import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();

        // 1. Add employees
        empDept.put(101, "IT");
        empDept.put(102, "HR");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "Sales");

        // 2. Change department
        empDept.put(102, "Finance");

        // 3. Find all employees in a department
        String dept = "Finance";
        System.out.println("Employees in " + dept + ":");
        empDept.entrySet().stream()
                .filter(e -> e.getValue().equals(dept))
                .forEach(e -> System.out.println(e.getKey()));

        // 4. Count employees per department
        Map<String, Long> count = new HashMap<>();
        count = empDept.values().stream()
                .collect(Collectors.groupingBy(v -> v, Collectors.counting()));

        System.out.println("\nTotal Employees per Department:");
        count.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
