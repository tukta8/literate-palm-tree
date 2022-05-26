package day09_switchstatement;

public class ForLoop {

	public static void main(String[] args) {

		/*
		 * Syntax
		 */

		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
// 		if () {}
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello");
		}

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("_____________");
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}
// Create a for loop that can print from 10 to 30		

		for (int i = 10; i < 31; i++) {
			System.out.println(i);
		}

// Create a for from 50 to 25
		
		for (int i = 50; i > 26 ; i--) {
			System.out.println(i);
		}
	}
}
