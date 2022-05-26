package day11_3rdReview;

import java.util.Scanner;

public class Task1_WarmUp1 {

	public static void main(String[] args) {
/*Write program to enter the number and print it in words. (n < 100)
Example:
```text
23
twenty three

7
seven
*/
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number less than hundred");
		int num = input.nextInt();
		
		if (num < 0 || num > 100) {
		System.out.println("Wrong Input");
		}
		else
		{ int a = num %10;
		  int b = num/10;
		  int c = b % 10;
		  int d = num/100;
		  String [] one = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", " twelve",
				  			"thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eightteen", "nineteen"};
		
		  String [] ten = {" ", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
				 
		if ( num < 20) {
			System.out.println(one[num]);
		}
		else if (num < 100) {
			System.out.println(one[d] + ten[c] +one[a]);
		}
		else {
			System.out.println( one[d]+ ten[c]+ one[a] );
		}
		
		 input.close(); 
		  }}
}
