public class EarthVolume {
	public static void main(String[] args){
		int Earth_radius = 6378;
		float pi = 3.14f;
		float Volume = (4 * pi * Earth_radius*Earth_radius*Earth_radius)/3;
		float Volume_in_cubic_miles = Volume * 0.239913f;
		System.out.println("The volume of earth in cubic kilometers is " + Volume + " and cubic miles is " + Volume_in_cubic_miles);
		}
} 
    
