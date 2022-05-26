package day04_operators;

public class PrintFormatter {

	public static void main(String[] args) {
		
		// %s = string 
		// %d = digit (byte, short, int, long)
		// %f = float (float, double) = float
		//%b = boolean 
		// %.2f = 3.4567 => 3.45, %.1f 45.231 =>

		System.out.printf("Hello My Name is %s", "Irfan");
		
		System.out.println();

		System.out.printf("%s My Name is %s", "Bonjour","Irfan");
		
		System.out.println();
		
		System.out.printf("Is sunny today? %b", false);


		
		
		
	//	int age = 31;
		
	//	String message = "world";
		boolean isEligible = false;
	//	System.out.printf("Hello %s", message);

	//	System.out.printf("Hello %s! Leng is %d",message,age);
	//	System.out.println();
	//	System.out.printf("Leng is %d year old.",age);// this will throw error
	//	System.out.println();
	//	System.out.printf("Price is %f cheap",4.35); // this will format 3 dismal point 
	//	System.out.println();
	//	System.out.printf("%b is not eligible",isEligible);
		
	//	System.out.printf("My age is"+age+"year old");
	//	System.out.printf("my age isf");

		
	}

}
