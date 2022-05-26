package day08_control_flow;

public class Task6 {

	public static void main(String[] args) {
/*## Task6
Write a method which prints out the numbers from 1 to 100 but for numbers which are 
divisible both 3 and 5, print "FINRA" instead of the number,  for numbers which are 
divisible by 3, print "FIN" instead of the number and for numbers which are divisible
 by 5, print "RA" instead of the number.
 ex:
		output:
		1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
*/

		
		int x;
		
		for (x = 1; x < 100; x++){
		
		if (x % 3 == 0) System.out.print("FIN "+ " ");
		}
	

		for (x = 1; x < 100; x++){
		
		if (x % 5 == 0) System.out.print("RA "+ " ");
		}
		
		System.out.println("\n Number divisible by 3 and 5");
		for (x = 1; x < 100; x++){
		
		if ((x % 3 == 0 && x % 5 == 0) && (x%3 ==0 && x% 5 == 0) ) System.out.print("FIN" +"RA" + " "+"FIN "+"RA "); 
		}
		
}}
