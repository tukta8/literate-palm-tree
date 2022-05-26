package day07_2ndReview;

import java.util.Scanner;

public class CalculatorWithScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number A");
		double numA = scan.nextDouble();
		
		System.out.println("Enter Number B");
		double numB = scan.nextDouble();
		
		System.out.println("Type one of the following operator");
		System.out.println("+, -,,* ,/");
		String operator= scan.next();
		double total = 0; // 
		
		 if (operator.equals("+")) {
	            total = numA + numB;
	        }

	        if (operator.equals("-")) {
	            total = numA - numB;
	        }
	        
	        if (operator.equals("*")) {
	            total = numA * numB;
	        }
	        
	        if (operator.equals("/")) {
	            total = numA / numB;
	        }
	        
	        System.out.println(numA +" "+operator +" " + numB +" = " + total);
	        scan.close();
	}}