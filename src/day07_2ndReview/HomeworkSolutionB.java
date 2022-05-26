package day07_2ndReview;

import java.util.Scanner;

public class HomeworkSolutionB {

	public static void main(String[] args) {
		/*
		 * - you should create new class called `Solution_B`
- you must write the program that read string and integers from user and then print them to console
  with additional string as _Sample_
### Input Format
There are lines of input, and each line contains a single integer.
**Sample Input**
```text
Hello
100
125 
```
**Sample Output**
```text
My string is "Hello". 
The sum of the 100 and 125 is 225
	*/
		Scanner n = new Scanner(System.in);
		System.out.println("Enter text here");
	    String text= n.nextLine();
		
	    System.out.println("Enter the first number ");
		int num1= n.nextInt();
		
		System.out.println("Enter the second number ");
		int num2 =n.nextInt();
		
		System.out.println("Enter the third number ");
		int num3 = n.nextInt();
		
	    int sum	= (num1 + num2+ num3);
	 
		
		System.out.println(text +" "+ sum);
	n.close();
	}

}
