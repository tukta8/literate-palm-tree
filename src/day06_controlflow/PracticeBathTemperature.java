package day06_controlflow;

import java.util.Scanner;

public class PracticeBathTemperature {

	public static void main(String[] args) {
		
		
		 int bathTemperature = 105;
	        
	        if (bathTemperature < 90) {
	            System.out.println("Brrr!");
	            
	        }
	        
	        if (bathTemperature > 90 && bathTemperature < 95) {
	            System.out.println("That's lukewarm.");
	        }
	        
	        if (bathTemperature >= 95 && bathTemperature <105) {
	            System.out.println("Perfect!");
	        }
	        
	        if (bathTemperature >= 105 && bathTemperature <110) {
	            System.out.println("This isn't a hot tub");
	        }
	        if (bathTemperature >= 110) {
	            System.out.println("Are you trying to boil a lobster?");
		}
		
		
	}

}
	
	
