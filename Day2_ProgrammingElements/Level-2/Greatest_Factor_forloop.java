import java.util.Scanner;

class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest Factor (beside itself): " + greatestFactor);
    }
}
