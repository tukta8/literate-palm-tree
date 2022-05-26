package day15_4thReview;

import java.util.Scanner;

public class Ask1to100 {

	public static void main(String[] args) {
/*		 to access multi-dimension structure int[][], table.

	      for (int row = 1; row <= 8; row++) { // row
	         for (int column = 0; column < 5; column++) { // column
	            System.out.print(column+" ");
	         }
	         System.out.println();
	      }	
*/	 
		
		// ask user to enter number between 1-100.
	      // if input not in the range, the program should ask again
	      Scanner sc = new Scanner(System.in);
	      int input;
	      while (true) {
	         System.out.print("enter number between 1-100: ");
	         input = sc.nextInt();
	         if (input > 0 && input <= 100) break;
	         System.out.println("Number is not in 1-100 range");
	      }
	      System.out.println(input);
		
	}

	

}
