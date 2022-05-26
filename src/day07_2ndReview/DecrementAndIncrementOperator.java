package day07_2ndReview;

public class DecrementAndIncrementOperator {

	public static void main(String[] args) {
		//	Prefix and Postfix
		// ++, _--
		int x=1;
		int y= x++; //  assign x -> y, then increment x 
		x++; // x=11;
		x--; // x=x-1;
	// --X; // x=x-1;	
		System.out.println(x+"," + y); // 2,1
		
		int i=1;
		int j= ++i; // increment i, then assign i->j
		System.out.println(i+"," + j); //2,2
		
	// Decrement And Increment with character
		char a='a';
		int numberA =a;
		a++; //a+= 1; -> a= a+1
		
		System.out.println(numberA);
	

		char ch = 'c'; // 100
		char b = 'b'; // 99 = 1
		char c = 'c'; // 100
//		a++; // a += 1; -> a = a+1
		System.out.println(ch);
		

		char ch1 = 'c'; // /
		ch-= 'b'; // ch1 = 'c' - 'b'
		ch += 'c'; // ch1 =ch1 - 'c'
//		a++; // a += 1; -> a = a+1
		System.out.println(ch);
		
		
		
		
		
		
		

	}

}
