
import college.student.Student;
import college.faculty.Faculty;
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Rahul", 101);
        Faculty f = new Faculty("Dr. Mehta", "Computer Science");
        s.display();
        f.display();
    }
}
