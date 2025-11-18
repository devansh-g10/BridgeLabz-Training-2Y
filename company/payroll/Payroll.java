package company.payroll;

import company.hr.Employee;

public class Payroll {
    public void calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        e.setSalary(e.getSalary() + bonus);
        System.out.println("10% bonus applied. Updated salary: " + e.getSalary());
    }
}
