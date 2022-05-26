package day11_3rdReview;
import java.util.Scanner;
public class Task3_AreYouAuthorize {

	public static void main(String[] args) {
/*
 * ## Task - Are You Authorize?
### Description
Let's write program that check the user authorization before using the internal company software.
The program should ask the full name of the user and clearance level (1-4).
Denote the level of the clearance:
- `1` = junior employee
- `2` = senior employee
- `3` = manager
- `4` = admin
### Instruction
This internal program can _only_ be access by management level employee and admin.
Once user logged in the program should display welcome
message `<name>, you are <role>. Welcome to the program ABC.`. For user that do not have a clearance
the program should display `Sorry, <name>. The <role> don't have access to this program.`
Example:
```text
Please type you name:
>John Holy
What is your clearance level?
>2
Sorry, John Holy. The senior employee don't have access to this program.
```
```text
Please type you name:
>Lula Blahblah
What is your clearance level?
>4
Lula Blahblah, you are admin. Welcome to the program ABC.`
```
 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your full name");
		String name = sc.nextLine();
		
		System.out.println("What is your clearance level?");
		int level = sc.nextInt();
		sc.close();

		switch (level) {
		case 1:
			System.out.println("Sorry, "+name +" "+"The junior employee don't have access to this program." );
			break;
		case 2:
			System.out.println("Sorry, "+name + " "+"The senior employee don't have access to this program.");
			break;
		case 3:
			System.out.println(name+ ","+" "+ "you are manager. Welcome to the program ABC.");
			break;
		case 4:
			System.out.println(name+ ","+" "+ "you are admin. Welcome to the program ABC.");
			break;	
		default:
			System.out.println("Information is invalid");
		
		
		
	
		}	}
}

	
	
	
	
	
	
	
	
