package day07_2ndReview;

public class LogicaDemo {
	public static void main(String[] args) {
		/*
		 * 		Logical Operator = Boolean expression 
		 *
				result always be 'true' or 'false'
		NOT-!
		*/
		boolean isTall = true;
		System.out.println(!isTall); // false
		System.out.println(!(5>10));
		
		// AND - && => Binary Operator
		// all of operator need to be 'true', then the result == 'true'
		boolean b1 = false && false; // false
		boolean b2 = false && true; // false
		boolean b3 = true && false;// false
		boolean b4 = true && true; // false
		System.out.println(false && true && 10>3 && true);
		
		// OR - ||
		// At least one of operation is 'true', the the result == 'true'
		
//		boolean b1 = false && false; // false
//		boolean b2 = false && true; // true
//		boolean b3 = true && false;//  true
//		boolean b4 = true && true; //  true
		System.out.println(false && true && 10>3 && true);
		
		
		boolean isHandsome = true;
		boolean isRich = true;
		boolean isMtType = isHandsome &&  isRich;
	//	System.out.println(isMyType);
	
	
	}

}
