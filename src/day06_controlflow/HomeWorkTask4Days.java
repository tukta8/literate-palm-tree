package day06_controlflow;

import java.util.Scanner;

public class HomeWorkTask4Days {
	public static void main(String[] args) {
		
		
System.out.print("Enter the number");
		
		Scanner day = new Scanner(System.in);
		int d = day.nextInt();
		if (d == 1) {
		System.out.println("Monday");
		
		}else if (d == 2) {
		System.out.println ("Tuesday");
		
		}else if (d == 3) {
			System.out.println ("Wednesday");
			
		}else if (d == 4) {
			System.out.println ("Thursday");
			
		}else if (d == 5) {
			System.out.println ("Friday");
			
		}else if (d == 6) {
			System.out.println ("Saturday");
			
		}else if (d == 7) {
			System.out.println ("Sunday");
			
		} else {
			System.out.println("Invalid information");
			
		day.close();
}}}
	
	
