import java.util.Scanner;

public class Q7_IntOperation {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        int io1 = a + b * c;      
        int io2 = a * b + c;      
        int io3 = c + a / b;      
        int io4 = a % b + c;      

        System.out.println("The results of Int Operations are " + io1 + ", " + io2 + ", " + io3 + ", and " + io4);

        }
    }
}