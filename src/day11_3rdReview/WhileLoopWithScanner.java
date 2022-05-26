package day11_3rdReview;

import java.util.Scanner;

public class WhileLoopWithScanner {

	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
			int sum = 0;
			do {
				int elem = sc.nextInt();
				sum += elem;
			} while (sc.hasNextInt());
			System.out.println(sum);
	*/	

/*
 * Write program that count number of digits in number
  Example:
345234
345234 has 6 digits
you can reduce the digit by divide the number by 10
 */
			int count = 0;
			int number= 100_000; // 10,000, 1,000, 100, 10 ,1, 0
			int startNumber = number;
			while (number != 10) {
			number = number / 10;
			count++;
			}
			System.out.printf("%s has %s didgit",startNumber,count);
			

/* write program to print all alphabet with their ASCII values. (lower/ upperCase)
 */ 	
	/*		char A= 'A';
			while (A<= 'Z') {
				int asciiValue = A;
				System.out.println(A +" "+asciiValue);
				A++;
			
				 char a = 'a';
			      while (a <= 'z') {
			         int asciiValue = a;
			         System.out.println(a+" "+asciiValue);
			         a++;
			      }
		*/	
			
			Scanner scanner = new Scanner(System.in);
		      String input = "";
		      while (!input.equals("quit")) {
		         input = scanner.next();
		         switch (input) {
		            case "buy":
		               System.out.println("Buy something");
		               break;
		            case "sell":
		               System.out.println("Selling things");
		               break;
		            case "quit":
		               break;
		            default:
		               System.out.println("Invalid command. Try again");
		        
		      
		         
		         }
		         
		         
		      }	
			
			
			
			
/*
  a 97
  b 98 
  c 99
 */
			
			
			
}
}