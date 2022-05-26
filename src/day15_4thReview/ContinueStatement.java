package day15_4thReview;

public class ContinueStatement {

	public static void main(String[] args) {
		int n = 10;
		for (int i =0; i<n; i++) { // run n time
			if(i% 2!=0) {//check the odd number
				continue; // go back to line 8 (not execute line 11)
			}
			System.out.println(i+" ");// print even number from 0-n
			
			
	/*		for (int i =0; i<n; i++) {
				if(i% 2==0) {//check the even number
					continue;
				}
				System.out.println(i+" ");
	*/
	
	}

}
}