package day06_controlflow;

import java.util.Scanner;

public class HomeWorkTask6 {

	public static void main(String[] args) {
	
		Scanner num = new Scanner(System.in);
		System.out.println("Enter first number");
		double n1 = num.nextDouble();
		
		System.out.println("Enter second number");
		double n2 = num.nextDouble();
		
		double add = n1 + n2; 
		System.out.println("add = "+ add);
		
		double subtract = n1 - n2; 
		System.out.println("subtract = "+subtract);
		
		double multiply = n1 * n2; 
		System.out.println("multiply = "+multiply);
		
		double divide = n1 /n2; 
		System.out.println("divide = "+divide);
		
		
		num.close();

	}}
		


	

