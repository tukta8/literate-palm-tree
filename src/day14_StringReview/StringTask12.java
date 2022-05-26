package day14_StringReview;

import java.util.Scanner;

public class StringTask12 {

	public static void main(String[] args) {
/*## Task12
Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and followed by
an underscore and last name. Write a program that can swap first name with last name 
in the email (Seperated by an underscore). If the email doesn't contain an underscore 
print the given input email.
	Ex:
		input: mike_tyson@gmail.com
        output: tyson_mike@gmail.com
*/
		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter email address");

			int indexOf_ = -1; //index for _
			int indexOfAt = -1; //index for @
			String email = scan.next();
			if (email.contains("_"))
			{
			    for (int i=0;i<email.length();i++) //finding the index of '_' and '@'
			    {
			        if (email.charAt(i) == '_')
			            indexOf_ = i;
			        if (email.charAt(i) == '@')
			            indexOfAt = i;
			    }

			    String firstname = email.substring(0,indexOf_);
			    String lastname = email.substring(indexOf_+1,indexOfAt);
			    String newString = lastname + "_" + firstname + email.substring(indexOfAt,email.length());
			    System.out.println(newString);
			        }
			        else
			            System.out.println(email);
			   
			scan.close();
	}
}
	

	
	
	
	
	
	
