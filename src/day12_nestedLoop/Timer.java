package day12_nestedLoop;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 14; i >= 0; i--) {
			System.out.println(i);
		}
		
		for(int i = 1; i>= 0; i--) { // outer loop represent min
			System.out.println(i);
			
		for (int j= 59; j>= 0; j--) {
			System.out.println(i+":"+j); // inner loop represent sec
			Thread.sleep(1000);	
		
		}
		}

/*		for (int j= 59; j>= 0; j--) {
		System.out.println(j);
		}
*/	
		
}
}