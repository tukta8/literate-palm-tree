package day14_StringReview;

public class StringTask01 {

	public static void main(String[] args) {
		/*## Task1
`write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
Example:
    Input: Welcome To TechCircle
    output: We
*/
//						0123456789		 
		String input = "Welcome To TechCircle!";
	        
	        char firstChar = input.charAt(0);
//	        char lastChar = input.charAt(21)
	        
	        char lastChar = input.charAt(input.length()-1);
	        
	        System.out.println(firstChar);
	        System.out.println(lastChar);
	        
	      String result = ""+firstChar;
	      System.out.println(result);
	      result += lastChar;
	      System.out.println(result);
	      
// System.out.println(input.charAt(22-1));
	
	
	
	}

}
