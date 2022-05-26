package day15_4thReview;

import java.util.Scanner;

public class NestedLoopDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 while (true) {
	         String input = sc.next();
	         // scanner take input from user
	         if (input.equals("exit")) break;
	         System.out.println(input);
	         System.out.println("======");
	      }
	}

}
