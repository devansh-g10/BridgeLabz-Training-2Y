import java.util.Scanner;
public class KmToMiles {
	public static void main(String[] args){
		double km;
		Scanner input = new Scanner(System.in);
		km = input.nextInt();
		double miles = 1.6*km;
		System.out.println("The distance " + km + "km in miles is " + miles);
		input.close();
		}
}