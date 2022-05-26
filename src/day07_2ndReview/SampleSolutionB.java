package day07_2ndReview;

import java.util.Scanner;

public class SampleSolutionB {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner (System.in);
//	      String strA = scanner.nextLine();
	      /*
	            1 2 3 4
	            ^
	       
	      String strB = scanner.next(); // 1
	     
	            1 2 3 4
	              ^
	      
	      String strC = scanner.next(); // 2
	      
	            1 2 3 4
	                ^
	       */

//	      System.out.println(strA);
//	      System.out.println(strB);
//	      System.out.println(strC);
		
		
		
	      Scanner scanner = new Scanner (System.in);
	      String strA = scanner.nextLine();
	      int numA = scanner.nextInt();
	      int numB = scanner.nextInt();

	      System.out.println("My string is " + strA);
	      System.out.println("The sum of the " + numA + " and " + numB + " is " + (numA + numB));
	      System.out.printf("The sum of the %d and %d is %d", numA, numB, numA + numB);
		
		
		
		
		
		
		
		
		
		
		

	}

}
