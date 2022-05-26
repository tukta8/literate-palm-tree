package day10_loop;

public class MuitficationTable {

	public static void main(String[] args) {
		
		int num= 5;
		/*
		 * 1x 1=1
		 * 1x 2=2
		 * 
		 * 10x 5 = 50;
		 */
		for (int i= 1; i<= 10; i++ ) {
			int total = i * num;
//			System.out.println(total);
//			System.out.println(i * num);
			System.out.println(i + "x" + num + "="+total);
		
		
		}

}}
