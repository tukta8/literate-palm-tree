package day07_2ndReview;

import java.util.Scanner;

public class HomeworkSolutionG {

	public static void main(String[] args) {
/*
 * ## Task G - Weird Number

Given an integer `n` , perform the following conditional actions:

- If `n` is odd, print `Weird`
- If `n` is even and in the inclusive range of `2` to `5` , print `Not Weird`
- If `n` is even and in the inclusive range of `6` to `20` , print `Weird`
- If `n` is even and greater than `20`, print `Not Weird`

### Input Format

A single line containing a positive integer `n` .

### Constraints

- 1 <= `n` <= 100

### Output Format

Print `Weird` if the number is weird; otherwise, print `Not Weird`.

Sample Input 0
> 3

Sample Output 0
> Weird

Sample Input 1
> 24

Sample Output 1
> Not Weird
*/

		int n = 101;
		if (n <= -1 || n >= 100) {
			System.out.println("Integer is out of range");
		}else if(n % 2 !=0) {
			System.out.println("Weird");
		
		}else if(n % 2 == 0 && n >= 2 && n <=5) {
			System.out.println("Not Weird");
			
		}else if(n % 2 == 0 && n>= 6 && n <=20) {
			System.out.println("Weird");
			
		}else if(n % 2 == 0 && n > 20) {
			System.out.println("Not Weird");
		
		
		
		}
	}
}
		