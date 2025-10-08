import java.util.Scanner;

public class FibonacciSequence {

    private static void generateFibonacci(int terms) {
        int a = 0, b = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        generateFibonacci(terms);

        scanner.close();
    }
}