package day08_control_flow;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
/*## Task4
Write a program that can calculate the salary after tax based on the following 
requirements
                the tax rates are:
               	35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K
                in addition, if the person is married, he/she will pay 5% less tax		
*/
	
		double marriedTax=0,n, married;
		double singleTax =0;
		double netIncome;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income ");
		n=sc.nextDouble();
		
		String maritalStatus;
		System.out.println("What is your marital status? Type 'M' for married and 'S' for single");
		maritalStatus = sc.next();
		
		 if (maritalStatus.equals("M")) {
		if(n< 80000)
			marriedTax = (0.2 * n) - (.05 *n);
		
		else if(n == 80000 || n < 100000) {
			marriedTax = (0.25 * n) - (0.05 * n);
		}
		else if(n== 100000 || n < 130000) {
			marriedTax = (0.3 * n) - (0.05 * n);
		}
		else if (n >= 130000){
			marriedTax = (0.35 * n) - (0.05 * n); 
		}
		System.out.println("Taxable amount is "+marriedTax);
		}
		netIncome = n - marriedTax;
		System.out.println("Net Income is  "+netIncome);
		 
		if (maritalStatus.equals("S")) {
			 if(n< 80000)
					singleTax = (0.2 * n);
				
				else if(n == 80000 || n < 100000) {
					singleTax = (0.25 * n);
				}
				else if(n== 100000 || n < 130000) {
					singleTax = (0.3 * n);
				}
				else if (n >= 130000){
					singleTax = (0.35 * n); 
				}
				System.out.println("Taxable amount is "+singleTax);
				 }
				netIncome = n - singleTax;
				System.out.println("Net Income is  "+netIncome);
		 
	
	}
	}


