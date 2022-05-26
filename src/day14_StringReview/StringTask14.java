package day14_StringReview;

import java.util.Scanner;

public class StringTask14 {

	public static void main(String[] args) {
/*## Task14
Write a program that asks user to enter first and last names, and then prints the 
full name in regular format (first character in upper case)
	input:
		  firstName = "tecHCIrcle"
		  lastName = "SCHOOL";

	output:
		  Techcircle School
*/
		Scanner scan = new Scanner(System.in);
			System.out.println("Please your first name and last name");
			String inputN = scan.nextLine();
			String inputL = scan.nextLine();
			
			String n =inputN.toUpperCase().substring(0,1) + inputN.toLowerCase().substring(1);
			String l =inputL.toUpperCase().substring(0,1)+inputL.toLowerCase().substring(1);
		
			System.out.println(n+" "+l);
			
					scan.close();
	}
}
		
		
		
		
		
		
