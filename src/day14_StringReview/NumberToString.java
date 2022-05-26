package day14_StringReview;

public class NumberToString {

	public static void main(String[] args) {
		int a = 100;
        int b = 100;

        System.out.println(a+b); //200

        String valueA = "";
        String valueB = "";

        System.out.println(valueA.length());//0
        System.out.println(valueB.length());//0

        valueA = valueA +a;// 100 as a String
        System.out.println(valueA.length());//3
        System.out.println(valueA.charAt(0));//1
        System.out.println(valueA.charAt(1));
        System.out.println(valueA.charAt(2));

        valueB += b;
        
        System.out.println(valueB);// 100 as a String

        System.out.println(valueA+valueB);

	}

}
