package day13_String;

public class StringIndexOfMethod {

	public static void main(String[] args) {

//					  012345678910		
		String name ="President George Washington";
/*		 name.indexOf('P');		//0
		name.indexOf('e');		//2
		name.indexOf("George");	//10
		name.indexOf('e',3); 	//6	
		 name.indexOf("Bob");	//-1
		 name.lastindexOf('e');	//15
*/		 
		 System.out.println(name.charAt(8));
		 System.out.println(name.charAt(9));
		 System.out.println(name.charAt(10));
		 System.out.println(name.charAt(17));
	
		 System.out.println(name.indexOf('p'));
		 System.out.println(name.indexOf('P'));
		 
		 System.out.println(name.indexOf('e'));
		 System.out.println(name.indexOf('e',3));
		 System.out.println(name.indexOf('e',9));
		 
		 
		 System.out.println(name.lastIndexOf('e'));
		 
		 System.out.println(name.indexOf("George"));
		 System.out.println(name.indexOf("rge"));
		 System.out.println(name.indexOf("Bob"));
		 
		 System.out.println(name.indexOf("George")> -1); //true
		 System.out.println(name.indexOf("Bob")> -1); //false
	
	}

}
