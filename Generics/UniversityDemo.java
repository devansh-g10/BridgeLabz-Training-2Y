import java.util.*;

// Base class
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + getClass().getSimpleName() + ")";
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
}

class Professor extends Person {
    Professor(String name) {
        super(name);
    }
}

// Generic Course class
class Course<T extends Person> {
    String courseName;
    List<T> members = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addMember(T member) {
        members.add(member);
    }

    void showCourseMembers() {
        System.out.println("Course: " + courseName);
        for (T m : members) {
            System.out.println(" - " + m);
        }
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        Course<Student> javaCourse = new Course<>("Java Programming");
        javaCourse.addMember(new Student("Rohit"));
        javaCourse.addMember(new Student("Aisha"));

        Course<Professor> facultyCourse = new Course<>("Faculty Research Group");
        facultyCourse.addMember(new Professor("Dr. Mehta"));
        facultyCourse.addMember(new Professor("Dr. Sharma"));

        javaCourse.showCourseMembers();
        System.out.println();
        facultyCourse.showCourseMembers();
    }
}
