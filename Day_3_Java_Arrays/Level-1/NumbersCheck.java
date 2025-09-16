import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // check numbers
        for (int n : arr) {
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println(n + " is Positive and Even");
                } else {
                    System.out.println(n + " is Positive and Odd");
                }
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println(n + " is Zero");
            }
        }

        // compare first and last element
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }
}
