package day08_control_flow;

import java.util.Scanner;

public class Task3NumberToword {

	public static void main(String[] args) {
/*## Task3
Create a class called NumberToWord, and write a java program that can convert numbers
 between 0 ~ 9 to words
			Ex:
				number = 1;
			output:
				One
*/		
		Scanner n = new Scanner(System.in);
		System.out.print("Enter Number one digit: ");
        int num = n.nextInt();
    
        String [] onedigit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
            };

      
  while(num != -1)
 {
   if (num < 10)
    {
        String result = onedigit[num];
        System.out.println("Result " + result);
        num =n.nextInt();
	n.close();
    }
 }}
}

		
		
		

	


