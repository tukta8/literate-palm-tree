package day14_StringReview;

public class StringTask06 {

	public static void main(String[] args) {
		
/*## Task6
write a program that can return the initials of the user

            ex:
                techcircle
                school

            output:
                T.S

        Note: Pay attention to the example output
*/
		String name = "tukta mangan";
		String firstInitial = name.substring(0, 1);
		
		String lastInitial = name.substring(6, 7);
		
		System.out.println("Initial " +firstInitial.toUpperCase() + "." +lastInitial.toUpperCase());
	}
}
		
		
		

