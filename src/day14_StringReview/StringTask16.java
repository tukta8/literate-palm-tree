package day14_StringReview;

public class StringTask16 {

	public static void main(String[] args) {
/*## Task16
Write a program to extract distinct character from a string
     input: abcabcabcabc
     output:abc
*/
		String input = "abcabcabca";
		
		for (int i = 0; i < input.length(); i++)
	    {
	        int extract = 0;
	        for (int j = 0; j < input.length(); j++)
	        {
	            // checking if two characters are equal
	            if (input.charAt(i) == input.charAt(j) && i != j)
	            {
	                extract = 1;
	                break;
	            }
	        }
	        if (extract == 0)
	            System.out.print(input.charAt(i));
	    }

	}
}
		
		
		
		
		
		
		

	

