package day06_controlflow;

import java.util.Scanner;

public class HomeWorkTask2Age {

	public static void main(String[] args) {
		
		System.out.print("Enter the Age: ");
		Scanner age = new Scanner(System.in);
		int i = age.nextInt();
	
		if (i >= 0 && i <= 2) {
			System.out.println("Infant");
			
		} else if (i >= 3 && i <= 4) {
			System.out.println("Toddler");
		
		} else if (i >= 5 && i <=7) {
			System.out.println("Early school age");
		
		} else if (i >= 8 && i <= 12) {
			System.out.println("Middle school");

		} else if (i >= 13 && i <= 17) {
			System.out.println("Early adolescence");
			
		} else if (i >= 18 & i <= 25) {
			System.out.println("Later adolescence");
				
		} else if (i >= 25 && i <= 30) {
			System.out.println("Early adulthood");
				
		} else if (i >= 30 && i <= 50) {
			System.out.println("Middle adulthood");
			
		} else if (i >= 50 && i <= 130) {
			System.out.println("Later adulthood");
			
		
		} else {
			System.out.println("Invalid information");
			age.close();

	}

}}
