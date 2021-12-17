package assignment;
import java.util.Scanner;
public class converting {
	

	//public class MathUnitConversions16 {

		public static void main(String[] args) {

			float dollars,rupees;

			Scanner in = new Scanner(System.in);

			System.out.println("Please enter dollars:");

			dollars = in.nextLong();

			rupees = dollars * 64;

			System.out.println(rupees + " Rupees");
			
			System.out.println("Please eneter rupees :");
			
			rupees=in.nextLong();
			
			 dollars= (rupees *70);

		}
	}
