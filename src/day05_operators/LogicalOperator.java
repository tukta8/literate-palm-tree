package day05_operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		// && , || , !
		
		
		// && AND
		
		/*
		 * ConditionA  ConditionB  Result
		 *  true		 true		true
		 * 	true		 false		false
		 *  false        true       false
         *  false        false      false
		 * */
		
		int a = 10;
		int b = 5;
		int c = 15;
		
		boolean conditionA = a + b == c;
		boolean conditionB = c - b == a;
		
		System.out.println( conditionA  && conditionB);
		
		System.out.println((a +b == c) && (c-b == a));
		
		conditionA = c / b >= 3;
		
		conditionB = a +b > c;
		
		boolean result = conditionA && conditionB;
		
		System.out.println(result);
		
		String userName = "techcircle";
		
		String password = "abc123";
		
		System.out.println(userName == "techcircle" && password == "abc123");
		
		System.out.println(userName == "hello;" && password == "acb123");
		
		System.out.println(userName == "techcircle" && password == "abc124");
		
		System.out.println(userName=="techcircl" && password =="abc124");
		
		
		
	// || OR
		
		/*
		 * ConditionA  ConditionB  Result
		 *  true		 true		true
		 * 	true		 false		true
		 *  false        true       true
         *  false        false      false
		 * */
		
		a = 1;
		b = 2;
		c = 3;
		
		conditionA = a + b == c;// true
		conditionB = a - b > c; // false
		
		System.out.println(conditionA || conditionB);
		
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		
		System.out.println(false || true); // true
		
		System.out.println(false || false); // false
		
		System.out.println(conditionA || conditionB); // true
		
		System.out.println(conditionA || c/b == 3); //
		
		System.out.println(c+a < b+a || a < 5);
		
		
		// Logical not!
		
		/*
		 	!true == false
		 	!false == true
		  **/
		
		conditionA = true;
		conditionB = false;
		
		System.out.println(conditionA);
		System.out.println(conditionB);
		
		
		
		
		
		
		
		
		

	}

}
