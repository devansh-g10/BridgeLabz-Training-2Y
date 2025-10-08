import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();

        int minLen = Math.min(s1.length(), s2.length());
        boolean equal = true;

        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                equal = false;
                if (s1.charAt(i) < s2.charAt(i))
                    System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
                else
                    System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
                break;
            }
        }

        if (equal) {
            if (s1.length() == s2.length())
                System.out.println("Strings are equal");
            else if (s1.length() < s2.length())
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
            else
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
        }
    }
}
