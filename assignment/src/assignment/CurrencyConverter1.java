package assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter1 {
	public static double convert(double amount, String source_currency, String target_currency) {
		double sum ,dollar, pound, code, euro, yen, ringgit, rupee;
		sum=(amount*75.63);
		//sum=(amount*70);
		return sum;
	}
	public static void main(String[] args) {
		//DecimalFormat f = new DecimalFormat("##.##");
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" please Enter which currency You want to Convert ? ");
//		System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
		
		String source_currency=null;
		String target_currency=null;
		double result;
		//result=convert(1000,"INR","USD");
		result=convert(2000,"pound","INR");
		System.out.println("Conversion from"+source_currency+"to"+target_currency+"is"+result);
	}

}
