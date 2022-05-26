package day07_2ndReview;

import java.util.Scanner;

public class HomeworkSolutionC {

	public static void main(String[] args) {
		/*
		 * ## Task C - Plus or Minus Ten
- Create the new class, called `Solution_C`
- Write a program that reads a input from user
- It should print `true` if value is in between -10 and 10. or `false` otherwise.
Sample Input:
> 5

Sample Output:
> true

Sample Input:
> -15

Sample Output:
> false
		 */

		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the number");
		 int i= input.nextInt();
		int a = -10;
		int b = 10;
		
		System.out.println();
		if (i >= -10  && i<=  10 ) {
		System.out.println(true);
		
		} else System.out.println(false);
		
          input.close();
          
}}
