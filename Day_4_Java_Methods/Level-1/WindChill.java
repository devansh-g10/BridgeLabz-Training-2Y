import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (°F): ");
        double t = sc.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double w = sc.nextDouble();

        double windChill = calculateWindChill(t, w);
        System.out.println("Wind Chill Temperature = " + windChill);
    }
}
