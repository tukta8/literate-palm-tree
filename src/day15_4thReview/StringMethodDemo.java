package day15_4thReview;

public class StringMethodDemo {

	public static void main(String[] args) {
// String sequence of character
// "... some string..."
		
		String name = "Hello";
		// String is reference type
		String secondName = new String("World");
		// String can be empty
		String thisIsEmpty = "";
		// String can store only one character
		String s = "s";
		char S = 's';// this is not the same as above
		
		// String can be null
		String thisIsNull = null;
		String str; //null
		System.out.println(thisIsNull); // => null
		System.out.println(thisIsEmpty);// => will not print anything
		
		System.out.println(thisIsNull.toLowerCase());// => NPE
//		System.out.println(str.toLowerCase());// => this will not compile
		
		
		
	}

}
