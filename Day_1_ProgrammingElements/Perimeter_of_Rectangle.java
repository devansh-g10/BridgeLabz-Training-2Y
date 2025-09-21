import java.util.Scanner;
public class Perimeter_of_Rectangle {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();    
        double perimeter = 2 * (length + width);
        System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
        scanner.close();
    }
    
}
