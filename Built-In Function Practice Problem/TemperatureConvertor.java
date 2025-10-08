import java.util.Scanner;

public class TemperatureConverter {

    private static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    private static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to (C or F): ");
        char toUnit = scanner.next().charAt(0);

        if (toUnit == 'C' || toUnit == 'c') {
            System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", temp, fahrenheitToCelsius(temp));
        } else if (toUnit == 'F' || toUnit == 'f') {
            System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", temp, celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}