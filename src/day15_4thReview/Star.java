package day15_4thReview;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
/*		Scanner in = new Scanner(System.in); printout star
		for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < 5; j++) {
                System.out.print("*");
*/          
		 /*
	       *****      0
	       -*****     1
	       --*****    2
	       ---*****   3
	       ----*****  4
	       */

	      char star = '*';
	      char space = '-';
	      int n = 5;

	      for (int i = 0; i < n; i++) { // run 5 times

//	       // space loop
	         for (int j = 0; j < i; j++) {
	            System.out.print(space);
	         }

	         // star loop
	         for (int j = 0; j < n; j++) { // run 5 times
	            System.out.print(star); // print 5 stars
	         }

	         System.out.println();
	      }
	
	
	}

        

		
	}


