package ui;

import model.Student;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static StudentService service = new StudentService();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = readInt("Enter choice: ");
            switch (choice) {
                case 1: addStudentUI(); break;
                case 2: listStudentsUI(); break;
                case 3: updateStudentUI(); break;
                case 4: deleteStudentUI(); break;
                case 5: showStudentUI(); break;
                case 0:
                    System.out.println("Exiting... bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\n=== Student Result Management ===");
        System.out.println("1. Add Student");
        System.out.println("2. List All Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Show Student by Roll");
        System.out.println("0. Exit");
    }

    private static void addStudentUI() {
        String roll = readStr("Roll No: ");
        String name = readStr("Name: ");
        String course = readStr("Course: ");
        int m1 = readInt("Math marks: ");
        int m2 = readInt("Physics marks: ");
        int m3 = readInt("Chemistry marks: ");
        Student s = new Student(roll, name, course, m1, m2, m3);
        service.addStudent(s);
        System.out.println("Added: " + s.getName() + " | Percentage: " + s.getPercentage());
    }

    private static void listStudentsUI() {
        List<Student> list = service.listStudents();
        System.out.println("Total students: " + list.size());
        for (Student s : list) {
            System.out.printf("%s | %s | %s | Total:%d | %%:%.2f | Grade:%s%n",
                    s.getRollNo(), s.getName(), s.getCourse(), s.getTotal(), s.getPercentage(), s.getGrade());
        }
    }

    private static void updateStudentUI() {
        String roll = readStr("Enter roll no to update: ");
        var opt = service.findByRoll(roll);
        if (opt.isEmpty()) {
            System.out.println("Not found.");
            return;
        }
        Student s = opt.get();
        System.out.println("Leave blank to keep existing value.");
        String name = readStrOptional("Name ("+s.getName()+"): ");
        if (!name.isBlank()) s.setName(name);
        String course = readStrOptional("Course ("+s.getCourse()+"): ");
        if (!course.isBlank()) s.setCourse(course);
        String m1s = readStrOptional("Math ("+s.getMarksMath()+"): ");
        if (!m1s.isBlank()) s.setMarksMath(Integer.parseInt(m1s));
        String m2s = readStrOptional("Physics ("+s.getMarksPhysics()+"): ");
        if (!m2s.isBlank()) s.setMarksPhysics(Integer.parseInt(m2s));
        String m3s = readStrOptional("Chemistry ("+s.getMarksChemistry()+"): ");
        if (!m3s.isBlank()) s.setMarksChemistry(Integer.parseInt(m3s));

        if (service.updateStudent(s)) System.out.println("Updated.");
        else System.out.println("Update failed.");
    }

    private static void deleteStudentUI() {
        String roll = readStr("Enter roll no to delete: ");
        if (service.deleteStudent(roll)) System.out.println("Deleted.");
        else System.out.println("Not found.");
    }

    private static void showStudentUI() {
        String roll = readStr("Enter roll no: ");
        var opt = service.findByRoll(roll);
        if (opt.isPresent()) {
            Student s = opt.get();
            System.out.println("Name: " + s.getName());
            System.out.println("Course: " + s.getCourse());
            System.out.println("Marks: " + s.getMarksMath() + ", " + s.getMarksPhysics() + ", " + s.getMarksChemistry());
            System.out.println("Total: " + s.getTotal());
            System.out.println("Percentage: " + s.getPercentage());
            System.out.println("Grade: " + s.getGrade());
        } else {
            System.out.println("Not found.");
        }
    }

    private static int readInt(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Please enter integer: ");
        }
        int val = sc.nextInt();
        sc.nextLine();
        return val;
    }

    private static String readStr(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    private static String readStrOptional(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
