import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salary = new HashMap<>();
        salary.put("Amit", 50000.0);
        salary.put("Neha", 70000.0);
        salary.put("Ravi", 45000.0);
        salary.put("Sita", 90000.0);
        salary.put("John", 85000.0);
        salary.put("Priya", 60000.0);

        // Give raise
        String emp = "Ravi";
        if (salary.containsKey(emp))
            salary.put(emp, salary.get(emp) * 1.10);
        else
            System.out.println("Employee not found");

        // Average salary
        double avg = salary.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println("Average Salary: " + avg);

        // Highest salary
        double maxSalary = Collections.max(salary.values());
        System.out.println("Highest Paid Employees:");
        salary.entrySet().stream()
                .filter(e -> e.getValue() == maxSalary)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
