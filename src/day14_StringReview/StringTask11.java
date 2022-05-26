package day14_StringReview;

import java.util.Scanner;

public class StringTask11 {

	public static void main(String[] args) {
/*## Task11
Ask user to enter a word. If the work starts with x, print the word without x.
     Input:
           xcode
     Output:
           code
*/		Scanner i = new Scanner(System.in);
			System.out.println("Please enter a word");
			String wd = i.nextLine();
			
			System.out.println(wd.startsWith("x"));
			
			if (wd.startsWith("x")) {
				System.out.println(wd.substring(1));
			}
			else {
				System.out.println("invalid entry");
			i.close();
		}
	}
}
			
