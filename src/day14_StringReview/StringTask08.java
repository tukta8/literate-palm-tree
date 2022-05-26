package day14_StringReview;

import java.util.Scanner;

public class StringTask08 {

	public static void main(String[] args) {
		
/*## Task7
`
Write a method that asks user to enter a string.
       if the string is empty, print: string is empty
       if the string has more than 3 characters, print the last three characters
       if the string has less than or equal 3 characters, print the string itself
*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string");
		String str = sc.nextLine();
		
		String input = "";
		String last_three_char = str.substring(str.length()-3);	
		
				if(str.length() == 0 ) {
			System.out.println("string is empty ");
		}
		else if (str.length() > 3) {
			System.out.println(last_three_char);
		}
		else if(str.length() <= 3) {
			System.out.println(str);
		}

		sc.close();
	}
}
		
	
	

