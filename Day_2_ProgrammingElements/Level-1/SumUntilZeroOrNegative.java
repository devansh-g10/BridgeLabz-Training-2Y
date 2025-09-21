import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        System.out.println("Enter numbers (0 or negative to stop):");

        while (true) {
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            total += num;
        }

        System.out.println("Total sum = " + total);

        sc.close();
    }
}
