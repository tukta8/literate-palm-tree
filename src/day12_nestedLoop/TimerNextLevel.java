package day12_nestedLoop;

import java.util.Scanner;

public class TimerNextLevel {

	public static void main(String[] args)  throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" How long you want to wait for?");
//		int waitTime =2;
		
		int waitTime = scan.nextInt();
		System.out.println(waitTime+"time start");
		
		for (int i =waitTime; i>=0; i--) {
//			System.out.println(i);
			
			for (int j = 59; j<= 0; j--) { 
				System.out.println(i+":"+j);
				Thread.sleep(1000);
			
	}

	}
			System.err.println("Time Up!");
			scan.close();
	
	}
}