package college.main;

// Single-type imports
import college.student.Student;
import college.faculty.Faculty;

// On-demand import for static members
import static college.department.Department.printLine;
import college.department.Department;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Asha Sharma", "B.Tech CSE");
        Faculty f1 = new Faculty("Dr. Mehta", "Artificial Intelligence");
        Department d1 = new Department("Computer Science", 120, 10);

        System.out.println("====== COLLEGE INFORMATION SYSTEM ======\n");

        printLine();
        System.out.println("Student Details:");
        s1.display();

        printLine();
        System.out.println("Faculty Details:");
        f1.display();

        printLine();
        System.out.println("Department Details:");
        d1.display();

        printLine();
        System.out.println("End of Report");
    }
}
