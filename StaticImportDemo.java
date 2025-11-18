import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double a = 25;
        double b = 9;

        System.out.println("Square root of " + a + ": " + sqrt(a));
        System.out.println("Power (a^b): " + pow(a, b));
        System.out.println("Maximum: " + max(a, b));
        System.out.println("Minimum: " + min(a, b));
        System.out.println("Absolute value of -b: " + abs(-b));
    }
}
