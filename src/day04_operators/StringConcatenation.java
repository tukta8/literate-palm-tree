package day04_operators;

public class StringConcatenation {

	public static void main(String[] args) {
		String make ="Tesla";
		String model = "Model X";
		
//		System.out.println("make");
//		System.out.println("model");
	
		System.out.println(make);
		System.out.println(model);

		System.out.println("My next year new car will be ");
		System.out.println("My next year new car will be "+make);
		System.out.println("My next year new car will be "+make+model);
		System.out.println("My next year new car will be "+make+" "+model);
	
		System.out.println();
		
		String make1 ="Land Rover";
		String model1 = "Range";
	
		System.out.println("My next year new car will be"+make1);
		System.out.println("My next year new car will be"+make1+model1);
		System.out.println("My next year new car will be"+make1+" "+model1);
	
	}
	
	
	
}
