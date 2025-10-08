import java.util.Scanner;

public class BasicCalculator {

    private static double add(double a, double b) { return a + b; }

    private static double subtract(double a, double b) { return a - b; }

    private static double multiply(double a, double b) { return a * b; }

    private static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero!");
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: "); double num1 = scanner.nextDouble();
        System.out.print("Enter second number: "); double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char op = scanner.next().charAt(0);
        double result;

        try {
            switch (op) {
                case '+': result = add(num1, num2); break;
                case '-': result = subtract(num1, num2); break;
                case '*': result = multiply(num1, num2); break;
                case '/': result = divide(num1, num2); break;
                default: System.out.println("Invalid operation."); scanner.close(); return;
            }
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        scanner.close();
    }
}