package day09_switchstatement;

public class HomeworkTask1 {

	public static void main(String[] args) {

// Write a program to print number Between 20 to 30 

// whileLoop		int i= 20;
//					while (i < 31) {
//					System.out.println(i);
//					i++;
//	}

/*		int a = 20;
		do {
			System.out.println(a);
			a++;
		} while (a < 31);

		

		for (int i = 20; i < 31 ; i++) {
			System.out.println(i);
		}*/
		   System.out.println("While Loop");
           int num = 20;
           while(num <= 30) {
               System.out.println(num);
               num++;
           }
           
           System.out.println("Current value of varaible num is "+ num);
           
           num = 20;
           
           System.out.println("Do while loop");
           
//           do {
//               your code
//           }while (condition is true);
           
           do {
               System.out.println(num);
               num++;
           }while(num <= 30);
           
           System.out.println("For loop");
           
//           for (statement1 ; statement2 ; statement3) {
//               your code
//           }
           
           for (int i = 20;i < 31; i++) {
               System.out.println(i);
           }
	
	}
	
	
}
