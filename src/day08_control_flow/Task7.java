package day08_control_flow;

public class Task7 {

	public static void main(String[] args) {
/*## Task7
`
Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120
                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
*/

		
		 int i,fact=1;  
		  int number=4;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		}  
