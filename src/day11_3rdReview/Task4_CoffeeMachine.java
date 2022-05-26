package day11_3rdReview;

import java.util.Scanner;

public class Task4_CoffeeMachine {

	public static void main(String[] args) {
/*Let's start with a program that makes you a coffee � virtual coffee, of course. But in this project,
you will implement functionality that simulates a real coffee machine.
Now let's consider a case where you need a lot of coffee. Maybe, for example, you�re hosting a party
with a lot of guests. The program should calculate how much water, coffee, and milk are necessary to
make the specified amount of coffee. One cup of coffee made on this coffee machine contains 200 ml
of water, 50 ml of milk, and 15 g of coffee beans.
The user should input the amount of coffee he needs, in cups, for all the guests.
### Instruction
Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.
### Examples
The example below shows how your output might look. The symbol > represents the user input. Note
that it's not part of the input.
Example 1
```text
Write how many cups of coffee you will need: 
> 25
For 25 cups of coffee you will need:
5000 ml of water
1250 ml of milk
375 g of coffee beans
```
Example 2
```text
Write how many cups of coffee you will need: 
> 125
For 125 cups of coffee you will need:
25000 ml of water
6250 ml of milk
1875 g of coffee beans
```
*/

Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter how many cup of coffee you will need");
		
	     int cup = scan.nextInt();
	  
	     int water = 200 * cup;
	     int milk = 50* cup;
	     int coffeeBeans = 15 * cup;
	     System.out.println(water + "ml of water");
	     System.out.println(milk + "ml of milk");
	    System.out.println(coffeeBeans + "g of coffee Bean");
	     
		     
		
		}
	     
	
	}
	
	


