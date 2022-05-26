package day14_StringReview;

import java.util.Scanner;

public class StringTask09 {

	public static void main(String[] args) {
/*## Task9
`
Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
*/

		Scanner s = new Scanner(System.in);
			System.out.println("Please Enter two words");
			String word1 = s.nextLine();
			String word2 = s.nextLine();
		
			String outputword1= word1.substring(1);
			String outputword2 = word2.substring(1);
			
			System.out.println(word1.substring(1));
			System.out.println(outputword1.concat(outputword2));
			
		
			s.close();
	}
}
		
		
		
		
		
		
