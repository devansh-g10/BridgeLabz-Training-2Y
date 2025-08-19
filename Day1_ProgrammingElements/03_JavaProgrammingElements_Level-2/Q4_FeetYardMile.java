import java.util.Scanner;

public class Q4_FeetYardMile {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter the distance in feet: ");
        double Feet = input.nextDouble();

        double Yards = Feet / 3;

        double Miles = Yards / 1760;

        System.out.printf("The distance in yards is %.2f, and in miles is %.6f%n",
                Yards, Miles);

        }
    }
}