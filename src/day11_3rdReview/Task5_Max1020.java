package day11_3rdReview;

import java.util.Scanner;

public class Task5_Max1020 {

	public static void main(String[] args) {
/*## Task - max1020

Given 2 positive int values, return the larger value that is in the range 10..20 
inclusive, or return 0 if neither is in that range.
Example:
```text
11 19
19

19 11
19

11 9
11
*/
	Scanner input =new Scanner (System.in);
	System.out.println("Enter 2 positive number");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	if (num1 <= 20 && num1 >= 10 && num1 > num2) {
		System.out.println(num1);
	}
	if (num2 <= 20 && num2 >= 10 && num2 > num1) {
		System.out.println(num2);

	}
	else {
		System.out.println(" neither is in the range");
	
	}

}}
