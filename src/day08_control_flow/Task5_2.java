package day08_control_flow;

import java.util.Scanner;

public class Task5_2 {

	public static void main(String [] arg) {
		
/*		Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter five numbers"); 
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		if  ((a > b && a > c) && (a > d && a > e)) {
			System.out.printf("Between %d, %d, %d, %d,and %d, maximum is ", a, b, a, c,a,d,a,e);

		
		}else if ((b > a && b > c) && (b > d && b > e)) {
			
		}else if ((c > a && c > b) && (c > d && c > d)) {
			
		}else if ((d > a && d > b) && (d > c && d > e)) {
			
		}else if ((e > a && e >b) && (e > c && e > e)) {
		
		int max = Math.max(a, b); System.out.printf("Maximum value of %d and %d using Math.max() is %d %n", a, b, c, d, e, max);


		 

		 sc.close();
		
	
	
	
	}}}
*/	
	
		Scanner input = new Scanner(System.in);
		int max = 0;
		int number;
		for(int x = 0; x <= 5; x++) {
			System.out.println("Enter five number");
			number = input.nextInt();
		
			if (number > max) {
				max = number;
		}
			}
			System.out.println("The Maximun of the given number is " + max);
			
			input.close();
		}}
	
	
	


