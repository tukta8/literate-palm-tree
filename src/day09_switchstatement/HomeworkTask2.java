package day09_switchstatement;

public class HomeworkTask2 {

	public static void main(String[] args) {
// Write the program to calculate the sum of all the number between 1 to 100
// output = 5050;
		
/*		for (int n = 1; n < 101; n++) {
			System.out.println(n);
		}
		int sum=0;
//		sum = sum + n;
		sum += n; 
		
		System.out.println("sum =" +sum);
	System.out.println(1+2+3+4);
*/	
  int sum = 0;
      
      for (int i = 1 ; i < 101 ; i++) {
//          System.out.println(i);
          //sum = sum + i;
          sum += i;
      }
      
      System.out.println("Sum = "+ sum);
      
      System.out.println(1+2+3+4+5+6+7+8+9+10);
	}

}
