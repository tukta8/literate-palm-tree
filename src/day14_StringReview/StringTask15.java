package day14_StringReview;

import java.util.Scanner;

public class StringTask15 {

	public static void main(String[] args) {
/*## Task15
Write a program to extract digits from a String:
	input: ab123c4d56efg
	output:123456
*/
			String input = "ab123c4d56efg";
		
			String result1 = input.replaceAll("[a-z]", "");
//			String result2 = result1.replace("c","");
//			String result3 = result2.replace("d", "");
//			String result4 = result3.replace("efg", "");
			
			System.out.println(result1);
	}}
		
		
		
		
		