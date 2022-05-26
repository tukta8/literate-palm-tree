package day11_3rdReview;

import java.util.Scanner;

public class Task6_inOrderEqual {

	public static void main(String[] args) {
/* ## Task - inOrderEqual
Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6
7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is
allowed, such as 5 5 7 or 5 5 5.
Example:
```text
2 5 11 false
false
5 7 6 false
false
5 5 7 true
true		
 */
	
		int a=5;
		int b=7; 
		int c=9; 

		
		
		
		  if ( a <= b && b <= c)
			   System.out.println("equalOk");
			  else if ( b > a && c > b )
				 System.out.println("true");
			  else
			   System.out.println("false");
		
			
			}
		
}	
	
