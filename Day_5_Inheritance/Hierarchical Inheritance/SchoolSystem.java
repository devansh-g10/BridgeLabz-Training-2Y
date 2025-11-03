class Person {
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    @SuppressWarnings("FieldMayBeFinal")
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("This is a person.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Subclass Teacher
class Teacher extends Person {
    @SuppressWarnings("FieldMayBeFinal")
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Teacher of " + subject);
    }
}

// Subclass Student
class Student extends Person {
    @SuppressWarnings("FieldMayBeFinal")
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Student in grade " + grade);
    }
}

// Subclass Staff
class Staff extends Person {
    @SuppressWarnings("FieldMayBeFinal")
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Staff member in " + department + " department");
    }
}

// Demo class
public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Smith", 40, "Mathematics");
        Student s = new Student("Alice", 15, "10th");
        Staff st = new Staff("Bob", 30, "Administration");

        t.displayRole();
        System.out.println(t.getName() + " is " + t.getAge() + " years old.");

        s.displayRole();
        System.out.println(s.getName() + " is " + s.getAge() + " years old.");

        st.displayRole();
        System.out.println(st.getName() + " is " + st.getAge() + " years old.");
    }
}