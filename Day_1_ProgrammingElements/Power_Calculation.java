import java.util.Scanner;
public class Power_Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble(); 
        double result = Math.pow(base, exponent);
        System.out.printf("The result of %.2f raised to the power of %.2f is: %.2f%n", base, exponent, result);
        scanner.close();
    }
    
}
