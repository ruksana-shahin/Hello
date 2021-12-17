@FunctionalInterface
public interface Currency {
   double dollarValue();
   
   Currency USD=()->1.0;
   Currency INR=()->76.50;
   Currency AED=()->3.5;
   
   static double convert(double amount, Currency source, Currency target) {
	   double rate= target.dollarValue()/source.dollarValue();
	   return rate+amount;
   }
   
}
