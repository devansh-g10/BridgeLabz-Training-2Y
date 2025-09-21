import java.util.Scanner;

public class NumberChecker {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int n : numbers) {
            if (isPositive(n)) {
                System.out.print(n + " is Positive and ");
                System.out.println(isEven(n) ? "Even" : "Odd");
            } else {
                System.out.println(n + " is Negative");
            }
        }

        int cmp = compare(numbers[0], numbers[numbers.length - 1]);
        if (cmp == 0) System.out.println("First and Last are Equal");
        else if (cmp > 0) System.out.println("First is Greater than Last");
        else System.out.println("First is Smaller than Last");
    }
}
