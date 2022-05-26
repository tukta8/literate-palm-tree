package day06_controlflow;

import java.util.Scanner;

public class HomeWorkTask5 {
	public static void main(String[] args) {

	System.out.print("Enter the time");
	Scanner time = new Scanner(System.in);
	int t = time.nextInt();
	if (t < 12) {
	System.out.println("Good Morning");
	
	}else if (t<17) {
		System.out.println ("Good Afternoon");
		
	}else if (t<24) {
		System.out.println ("Good Evening");
	

	}}}
	
	