public class PenDistribution {
	public static void main(String[] args){
		int pens = 14;
		int students = 3;
		int reminder = pens%students;
		int Quantity_of_pens = pens / students;
		System.out.println("The Pen Per Student is " + Quantity_of_pens + " and the remaining pen not distributed is " + reminder ); 
		}
}
