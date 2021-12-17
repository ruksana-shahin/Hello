import java.util.Scanner;

public class ConsoleDemo {
	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		 System.out.println("Enter the Name :");
      		 
		  String name=console.next();
		   System.out.println("Name :"+ name);
		
		 String mobbileRegex="[7-9]{1}[0-9]{9}";
		   
		   String nameRegex="[A-Z][a-z]{4,}";
			 System.out.println(name.matches(nameRegex));
			 System.out.println("Name :"+name);
			 
			 System.out.println("enter email : ");
			 String email=console.next();
			   System.out.println("Email :"+ email);
		   
		// String email = "john123@gmail.com";
	      System.out.println("The E-mail ID is: " + email);
	      System.out.println("Is the above E-mail ID valid? " + isValid(email));
	}
		 
		 static boolean isValid(String email) {
		      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		      return email.matches(regex);		 
	}

}
