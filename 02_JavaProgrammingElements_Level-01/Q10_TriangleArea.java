import java.util.Scanner;

public class Q10_TriangleArea {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

        System.out.print("Enter the base : ");
        double baseInches = input.nextDouble();

        System.out.print("Enter the height : ");
        double heightInches = input.nextDouble();

        double areaSqInches = 0.5 * baseInches * heightInches;

        double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;

        double areaSqCm = 0.5 * baseCm * heightCm;

        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters%n",
                areaSqInches, areaSqCm);

        }
    }
}