package day07_2ndReview;

import java.util.Scanner;

public class HomeworkSolutionH {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		 int you = sc.nextInt();
		 int yourDate = sc.nextInt();
		 
		 if((you >=8 && you <= 10) || (yourDate >= 8 && yourDate <= 10)&& (you> 2 && yourDate > 2)) {
			System.out.println("Yes, you both will definitely get a table");
		
		 }else if (you <= 2 && you >= 0 || yourDate <= 2 && yourDate >= 0) {
			 System.out.println("Sorry, but notable for both of you");
		
		 }else {
			 System.out.println("Ahh, you maybe lucky tonight");
		 }
		 sc.close();

	}
}
		 
/*
 * int stylistness_me = 5;
 *
   int stylistness_date = 5;
   
   if (stylistness_me >= 8 || stylistness_me >= 8) {
	   System.out.println("Yes, you both will definitely get a table");
	  }
	  else if (stylistness_me >= 2|| stylistness_me >= 2){ 
	   	System.out.println("Sorry, but notable for both of you");
	  }
	   else {
	   System.out.println("Ahh, you maybe lucky tonight");
	   
	   
	   
	   
	   
	   
	   
*/	   
	   
	   
	   
   
	
		
		 
		 
		 
		 
		 
		 
		 