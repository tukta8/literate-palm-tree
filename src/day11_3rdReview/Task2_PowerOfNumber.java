package day11_3rdReview;

import java.util.Scanner;

public class Task2_PowerOfNumber {
public static void main(String[] args) {
/*
 * ## Task - Power of Number

Two numbers are entered through the keyboard. Write a program to find the value of one number raised
to the power of another.
### Constraint
- Do not use Java built-in method
Example:
```text
3 2
The result is 9
```
```text
4 4
The result is 256	
 */
		int b, p, result =1;
		System.out.println("Enter the base number");
		Scanner in = new Scanner(System.in);
		b = in.nextInt();
		System.out.println("Enter the power number");
		p =in.nextInt();
		
		for(int i = 1; i <= p; i++) {
			result = b* result;
			System.out.println("Power"+result);
			
			
			
		}




}
}
