import java.util.Scanner;
public class Volume_of_Cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);
        input.close();
    }
}
