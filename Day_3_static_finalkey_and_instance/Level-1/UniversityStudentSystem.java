class Student {
    static String universityName = "XYZ University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudent() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName +
                    ", Name: " + name +
                    ", Roll No: " + rollNumber +
                    ", Grade: " + grade);
        }
    }
}

public class UniversityStudentSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, "A");
        Student s2 = new Student("Meena", 102, "B");

        s1.displayStudent();
        s2.displayStudent();
        Student.displayTotalStudents();
    }
}
