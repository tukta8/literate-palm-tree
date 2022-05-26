package day11_3rdReview;

public class Task7_AlarmClock {

	public static void main(String[] args) {
/*
 ## Task - Alarm clock

Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are
on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.
Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on
vacation -- then on weekdays it should be "10:00" and weekends it should be "off".

Example:
```text
1 false
"7:00"

5 false
"7:00"

0 false
"10:00"
*/
//#1
			int day=5;
			boolean vacation = false;{
			  if(vacation){
			    if(day == 6 || day == 0) {
			     System.out.println("Off");
			    } else{
			     System.out.println("10:00");
			    }
			  } else{
			    if(day >= 1 && day <= 5){
			    System.out.println("7:00");
			    } else{
			    System.out.println("10:00");
			    }


//#2			 
			   if ( vacation == true && ( day == 0 || day == 6 ) )
				   System.out.println("Off");
			   if ( vacation == true && ( day == 1 || day == 2 || day == 3 || day == 4 || day == 5 ) )
				   System.out.println("10:00");
			   if ( vacation == false && ( day == 0 || day == 6 ) )
				   System.out.println("7:00");
			   else 
				   System.out.println("10:00");
			    	}
			  
		}
	}
	
}
			  
			  
			  
			  
	
	
	
	


