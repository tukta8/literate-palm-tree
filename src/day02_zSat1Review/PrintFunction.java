package day02_zSat1Review;

public class PrintFunction {

	public static void main(String[] args) {
		System.out.println(); // print to the console the n end with the new line 
		System.out.println("Hello World");
		System.out.printf("Hello World");
		// %s = string 
		// %d = digit (byte, short, int, long)
		// %f = float (float, double) = float
		//%b = boolean 
		// %.2f = 3.4567 => 3.45, %.1f 45.231 =>
		int age = 31;
		System.out.println();
		String message = "world";
		boolean isEligible = false;
		System.out.printf("Hello %s", message);

		System.out.println();
		
		System.out.printf("Hello %s! Leng is %d",message,age);
		System.out.println();
		System.out.printf("Leng is %d year old.",age);// this will throw error
		System.out.println();
		System.out.printf("Price is %f cheap",4.35); // this will format 3 dismal point 
		System.out.println();
		System.out.printf("%b is not eligible",isEligible);
		
		System.out.printf("My age is"+age+"year old");
		System.out.printf("my age isf");

		
		

	}

}


	


