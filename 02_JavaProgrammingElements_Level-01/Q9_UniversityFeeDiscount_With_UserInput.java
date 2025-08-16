import java.util.Scanner;
public class UniversityFeeDiscount_With_UserInput {
	public static void main(String[] args){
		int fee;
		Scanner input = new Scanner(System.in);
		fee = input.nextInt();
		int discountPercent;
		discountPercent = input.nextInt();
		float discount = (fee * discountPercent) / 100;
		float final_discounted = fee - discount;
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + final_discounted);
		input.close();
		}
}