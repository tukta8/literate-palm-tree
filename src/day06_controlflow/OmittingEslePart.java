package day06_controlflow;

public class OmittingEslePart {

	public static void main(String[] args) {
		
 //Syntax:
        
        /*
         * if (condition){
         *         statement1
         * }else{
         *         statement2
         * }
         * 
         * 
         * */
        
		
		int a = 4;
		if (a % 2 == 1) {
			System.out.println(a + " is odd number");
		}  
	        
		if( a%2 == 0) {
			System.out.println(a + " is even number");
		}
		
		System.out.println("line #29");
		
		
		int n1 = 300;
		int n2 = 300;
		
		if (n1 > n2) {
			System.out.println("max number is "+n1);
			System.out.println("min number is "+n2);
		}
		
		if (n1 < n2) {
			System.out.println("max number is "+n2);	
			System.out.println("min number is "+n1);
		}
			
		if (n1 == n2) {
			System.out.println("They are equal"+n2);
		
		}
		
		
		
		
		
		
		
		

	}

}
