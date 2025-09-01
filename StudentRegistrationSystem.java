public class StudentRegistrationSystem {
    public static void displayStudents(String[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
    public static void compareStrings(String str1, String str2) {
        System.out.println("Using '==': " + (str1 == str2));
        System.out.println("Using '.equals()': " + str1.equals(str2));
    }
    public static void searchStudent(String[] students, String name) {
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Student Registered");
        } else {
            System.out.println("Student Not Found");
        }
    }
    public static void main(String[] args) {
        String students[] = {"Anand", "prince", "Sumit", "Ravi", "Aman"};
        displayStudents(students);
        String s1 = "Anand";
        String s2 = "Anand";
        String s3 = new String("Anand");
        System.out.println(s1 == s2); // true, same reference in SCP
        System.out.println(s1 == s3); // false, different reference
        System.out.println(s1.equals(s3)); // true, same content

        
        String originalName = "Anand";
        String modifiedName = originalName.concat(" Rawat");
        System.out.println("Original Name: " + originalName); // Anand
        System.out.println("Modified Name: " + modifiedName); // Anand Rawat

        compareStrings(s1, s3);
        String searchName = "Ravi";
        searchStudent(students, searchName);
        searchName = "John";
        searchStudent(students, searchName);
        // StringBuffer demonstration
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer after append: " + sb.toString());
        sb.insert(5, ",");
        System.out.println("StringBuffer after insert: " + sb.toString());
        sb.delete(5, 6);
        System.out.println("StringBuffer after delete: " + sb.toString());


    }


}