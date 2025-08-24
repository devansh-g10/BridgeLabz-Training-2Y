import java.util.Scanner;

class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println("Result = " + result);
    }
}
