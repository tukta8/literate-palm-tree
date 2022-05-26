package day13_String;

public class StringSubStringMethod {

	public static void main(String[] args) {
		
		
		String str1 = "Television";
		System.out.println(str1.substring(4)); // print out vision
		System.out.println(str1.substring(2,5)); // print out lev
		
		String str2 = "Immutable";
		System.out.println(str2.substring(2));// mutable
		System.out.println(str2.substring(4));// table
		System.out.println(str2.substring(4,9));
		
		String email = "firstName.lastName@domainName.com";
		
		String gmail = "ifran.techcircle@gmail.com";
		
		System.out.println(gmail.indexOf('g'));
		
		System.out.println(gmail.indexOf('.'));
		
		String domainName = gmail.substring(17, 22);
		
		System.out.println(domainName);
		
		System.out.println(gmail.substring(gmail.indexOf('g'),gmail.lastIndexOf('.')));
		
		
		

	
	
	
	}

}
