package day14_StringReview;

import java.util.Scanner;

public class StringTask10 {

	public static void main(String[] args) {
/*## Task10
ask the user to enter a word. if the word ends with "ly", print "really???" , 
 otherwise, print "never mind"
*/		
		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter word");
			String input = scan.nextLine();
			
			String word = input;
			System.out.println(input.endsWith("ly"));
			
			if(input.endsWith("ly")) {
				System.out.println("really???");
			}
			else {
				System.out.println("never mind");
			}
		
			scan.close();
			
	}
}
		
		
