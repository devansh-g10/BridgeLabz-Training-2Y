package college.department;

public class Department {
    private String deptName;
    private int totalStudents;
    private int totalFaculty;

    public Department(String deptName, int totalStudents, int totalFaculty) {
        this.deptName = deptName;
        this.totalStudents = totalStudents;
        this.totalFaculty = totalFaculty;
    }

    public void display() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Total Faculty: " + totalFaculty);
    }

    public static void printLine() {
        System.out.println("-----------------------------");
    }
}
