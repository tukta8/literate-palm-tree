package day07_2ndReview;

import java.util.Scanner;

public class HomeworkSolutionD {

	public static void main(String[] args) {
	/*
	 * Prompt for: driver lastName, firstName, age, speedLimit, actual speed, and whether you are in a
	 *
		construction zone.

		Calculate the components of the fine and the total fine (see rules below).

		**Rules to calculate fine:**

		1. if driver is less than 5mph over limit, no fine is assessed, but you finish all prompts,
		   calculations and generate the report.
		2. else if driver is over limit by 20mph or less, charge $30 per every 5mph over limit.
		3. else if driver is more than 20mph over limit charge $50 per every 5 mph over limit.
		4. Don't mix rates! - driver is either charged $30 per 5mph over or $50 per 5mph over.
		5. if the violation occurred in a construction zone, you are to **DOUBLE** the fine.

		[comment]: <> (Lastly -- AFTER ALL OTHER CALCULATIONS ARE DONE: if driver is under 21 AND more than 20mph over)

		[comment]: <> (limit then you must add an additional straight $300 underage speeder fine. ** You are NOT to double)

		[comment]: <> (this)

		### Contraints

		- Only enter positive numbers for driver's age, speed limit and actual speed.
		- Don't enter ridiculously huge numbers. Your variables could overflow and formatting may not fit.

		**Example:**

		```text
		What is driver's firstname?
		> Greg
		What is driver's lastname?
		> Naman
		What is driver's age?
		> 30
		What is the speed limit (mph)?
		> 25
		What is driver's speed (mph)?
		> 45
		Is is a construction zone (Y/N)?
		> Y

		=========REPORT=========

		Driver name: 
		    Greg Naman
		Age:        
		    30 years old
		Speed limit:    25 mph
		Current speed:  45 mph
		Construction zone (Y/N)?: Y
		Speeding fine:  $120.00 
		*/
		String name, lastName, zone;
		int age, speedLimit, actualSpeed, overSpeed, baseFine=0, zoneFine=0, underAge, fine;
		Scanner t = new Scanner(System.in);
		
		System.out.println("Please enter name");
		name = t.next();
		
		System.out.println("Please enter lastName");
		lastName = t.next();
		
		System.out.println("Please enter age");
		age = t.nextInt();
		
		System.out.println("Please enter speedLimit");
		speedLimit = t.nextInt();
		
		System.out.println("Please enter actual speed ");
		actualSpeed = t.nextInt();
		
		System.out.println("Was driver in construction zone, Enter Yes or No");
		zone = t.nextLine();
		
// =========== calculate fine ============
		
		if(actualSpeed > speedLimit)
		{overSpeed = actualSpeed - speedLimit;
		}
		
		else {
			
			overSpeed=0;
		}	
		
		if (overSpeed < 5)
		{ baseFine = 0;
		}
		
		else if (overSpeed<= 20 ) 
			{	baseFine = 30 *(overSpeed / 5);
			}
		else if (overSpeed > 20)
		{
				baseFine = 50 * (overSpeed / 5);
		}
// =========== construction zone ===========
	
		if (overSpeed > 5)
		{ zoneFine = 0;
		}
		
		if (zone.equals("Yes"))
		{
			zoneFine = baseFine * 2;
		}

		 if (zone.equals("No"))
		{
			zoneFine = 0;
		}
//========== underAge =========
		
		if (age < 21 && overSpeed > 20) {
			underAge = 300;
		}
		else {
			underAge = 0;
		}
	
// ========== Total Fine ==========
		
		fine = baseFine + zoneFine + underAge;
		
// ========== Report ==========
		System.out.println("name" + name);
		System.out.println("lastName" + lastName);
		System.out.println("age" + age);
		System.out.println("speedLimit" + speedLimit);
		System.out.println("actualSpeed" + actualSpeed);
		System.out.println("zoneFine" + speedLimit);
		System.out.println("fine" + fine);
		{
		}
		
	t.close();
	}}
