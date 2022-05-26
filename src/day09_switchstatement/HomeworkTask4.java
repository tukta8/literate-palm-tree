package day09_switchstatement;

import java.util.Scanner;

public class HomeworkTask4 {
public static void main(String[] args) {
	
// Write a java program to print sum of even number between 1 to 100.
	
	  

/*	  int sum = 0;
	  for  (int i=1; i<= 100; i++){
		  if (i % 2 == 0) {
		  sum = sum +i;
		  }
		  System.out.println("sum of even number between 1 to 100: " + sum); 
	 }  
*/

	/*	int total = 0;
	int count = 1;
	while (count < 101) {
		if (count % 2==0) {
		total += count; // total = total + count
	}
	*/	
//      System.out.println(count);
//  }
//  count++;
//  break;
//}

//	System.out.println(total);


	int sum = 0;
	for (int i=0; i < 101; i+=2) {
		System.out.println(i);
		sum +=i;
	}
		System.out.println( sum);

}
}
