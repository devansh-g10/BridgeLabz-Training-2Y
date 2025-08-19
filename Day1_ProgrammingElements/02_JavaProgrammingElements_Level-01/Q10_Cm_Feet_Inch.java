import java.util.Scanner;
public class Q10_Cm_Feet_Inch {
	public static void main(String[] args){
		double Height;
		Scanner input = new Scanner(System.in);
		Height = input.nextInt();
		double foot = Height*0.0328084f;
		double inch = Height*0.393701f;
		System.out.println(" Your Height in cm is " + Height + " while in feet is " + foot + " and inches is " + inch);
		input.close();
		}
}