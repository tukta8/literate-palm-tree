package day08_control_flow;

import java.util.Scanner;

public class Task1SalaryCalculator {

	public static void main(String[] args) {
/*
 * ## Task1
`Create a class called SalaryCalculator.java
			1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
			2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax
					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
			3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
					   federalTaxRate = 26 (given as percentage, you need to convert to decimal)
				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560		
 */
			int hourlyRate = 0, weeklyHours = 0, Federaltax;
				double 		stateTaxRate = 0.06, federalTaxRate =  0.26;
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter Hourly Rate"); 
				hourlyRate = sc.nextInt();
				
				System.out.println("Enter Weekly Hour");
				weeklyHours = sc.nextInt();
				
				int weeklyHour = 40;
				double	salaryBeforeTax = hourlyRate * weeklyHour * 52;
				System.out.println(salaryBeforeTax);

// Calculate Taxes===
		
				double stateTax = salaryBeforeTax * 0.06;
				System.out.println(stateTax);
			
				
				double federalTax = salaryBeforeTax * 0.26;
				System.out.println(federalTax);
				
				double totalTax = stateTax + federalTax;
				System.out.println(totalTax);
				
				double netIncome = salaryBeforeTax - stateTax - federalTax;
				System.out.println(netIncome);
				

				System.out.println("Gross Pay is " + salaryBeforeTax);
				System.out.println("Federal Tax is " + federalTax);
				System.out.println("State Tax is " + stateTax);
				System.out.println("Total Tax is " + totalTax);
				System.out.println("Net Income is " + netIncome);
				sc.close();
	}

}
