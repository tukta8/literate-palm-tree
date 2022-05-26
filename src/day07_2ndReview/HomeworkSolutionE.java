package day07_2ndReview;

import java.util.Scanner;

public class HomeworkSolutionE {

	public static void main(String[] args) {
		/*
		 * A four-digit number `ABCD` is called lucky if `A` + `B` = `C` + `D`
Write a program that asks the user to enter a four-digit number and tell if the number is a lucky
number or not. if it's a lucky number print `Yay, <number> is a lucky number`, otherwise
print `Nah, <number> is not a lucky number`

**Example 1:**
```text
Please enter 4 digits number:
>3719
Yay, 3719 is a lucky number
```
**Example 2:**

```text
Please enter 4 digits number:
>3521
Nah, 3521 is not a lucky number
```
 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int numA = s.nextInt();
		 
		System.out.println("Enter second number");
		int numB = s.nextInt();
		
		System.out.println("Enter third number");
		int numC = s.nextInt();
		
		System.out.println("Enter fourth number");
		int numD = s.nextInt();
		
		if (numA +numB == numC + numD) {
			System.out.println( "Yah is a lucky number");
		}
		else { System.out.println("Nah is not a lucky number");
        
		}
		
				
		s.close();
}}
		