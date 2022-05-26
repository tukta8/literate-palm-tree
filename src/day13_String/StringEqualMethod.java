package day13_String;

public class StringEqualMethod {

	public static void main(String[] args) {
/*		
		String word1 = "Hello";
		String word2 = "hello";
		
		boolean b = word1.equals(word2);
		// returns true if the string word1 is equal to word2
				b= word1.equalsIgnoreCase(word2);
		// return true if the string word1 match word2. case blind
				
	b = "Raiders".equals("Raiders"); // true
	b = "Raiders".equals("Raiders"); // false
	b = "Raiders".equalsIgnoreCase("Raiders"); // true
	
		String 
	if (team.equalsIgnoreCase("raiders")) {
 	System.out.println("Go You"+ team);
*/		
		String str1 = "hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));// false
		System.out.println(str1.equalsIgnoreCase(str2));
	
		if (str1.equals(str2)) {
			System.out.println("They are equal");
		}else {
			System.out.println("not equal");
		}
	
		boolean result = str1.equals(str2);
			System.out.println(result);


	}
}