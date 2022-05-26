package day14_StringReview;

import java.util.Scanner;

public class StringTask02Reverse {

	public static void main(String[] args) {
	/*	Create a class called Reverse, write a program that will reverse a string.
	    Your program should reverse a string only 5 characters long.
	    If word is shorter, display message: "Too short!".
	    If word is longer, display message: "Too long!".
	    Otherwise, reverse this word and print out result into the console.
*/
/*	String name = "Tukta";
	if (name.length() >= 5){
	System.out.println("To long");
	}
	if (name.length() < 5){
		System.out.println("To short");
	} else {

/*		System.out.println(name.charAt(4)); 
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(0));
*/		
		   
//       for (int i = name.length()-1; i >=0 ; i--) {
//            System.out.println(i);
 //          System.out.print(name.charAt(i));
 
	
 String name = "perry";
 if (name.length() >= 5) {
	 System.out.println("To long");
 } else if (name.length() < 5) {
	 System.out.println("Too short");
	
	 for (int i =name.length()-1; i>=0; i--) {
		 System.out.println(name.charAt(i));
	
	
        }
	}

	}}
