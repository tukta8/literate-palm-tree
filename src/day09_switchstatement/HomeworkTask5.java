package day09_switchstatement;

public class HomeworkTask5 {

	public static void main(String[] args) {

//Write a java program to print sum of odd number between 1 to 100.

		int sum = 0;
		  for  (int i=1; i<= 100; i++){
			  if (i % 2 != 0) {
			  
				  sum = sum +i;
		}
		  }		
		  System.out.println("sum of the odd  number between 1 to 100 is :" + sum);
		  

}}
