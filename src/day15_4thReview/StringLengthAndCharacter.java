package day15_4thReview;

public class StringLengthAndCharacter {

	public static void main(String[] args) {
		
		  // find Length and Character
	      // .lenght() => int, number of character of the string
//	                        1234567890
	      //                            12345
	      String something = "something wrong";
	      int lenghtOfSthg = something.length(); // => 15

	      // .charAt() => char,
	      // return character of given index
	      // parameter index always start from 0

	  //                0123456789
	  //                          01234     last index = 14
	      String str = "something wrong";
	      char letter = str.charAt(13); //
	      System.out.println(letter); // => n
	      str.length(); // => 15

	      char firstLetter = str.charAt(0);
	      char lastLetter = str.charAt(str.length() - 1);
		
		
		
		
		
		
		
	}

}
