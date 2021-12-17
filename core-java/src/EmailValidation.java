import java.util.Scanner;

public class EmailValidation {
	  public static void main (String[] args) {
		  String input="syedruksana1996@gmail.com";
		  if(input.substring(input.indexOf('@'),input.indexOf('.')).length()>=3)
		  {
			  System.out.println(true);
		  }
		  //if(input.substring(0))
	  }
//	        System.out.print("Please Enter Your Email To Validate: ");
//	        Scanner input = new Scanner (System.in);
//	        String email  = input.nextLine();
//	        for (int i = 0 ;  i < email.length(); i ++) {
//	            if (email.indexOf("@") >= 1 ) {
//	                if (email.indexOf(".") >= email.indexOf("@")+1)
//	                    if ((email.indexOf("@")+email.indexOf(".") - email.length()) >= 1 )
//	                        System.out.print("Email Passed" + (email.length() - (email.indexOf("@")+email.indexOf("."))));
//	            }
//	        }
//	        System.out.print("\n String legnth: "+ (email.length()) + 
//	                "\n Index of @: " + email.indexOf("@") +
//	                "\n Index of dot: " + email.indexOf("."));
//	    }
	}


