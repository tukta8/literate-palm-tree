package day02_zSat1Review;

import java.awt.Point;

public class PrimitiveVsReference {

	public static void main(String[] args) {
		int x = 1; // initialize x to 1
		int y = x ;// assign x into y 
		x = 2; // reassign x to 2;
		System.out.println("x="+",y=+y");
		
		//==============================
		
// Reference Type Variable or Non-Primitive
		
		Point pointA = new Point(1,1);
		Point pointB = pointA; //1,1
		pointA.y = 2; // 1,2
		System.out.println(pointA);
		System.out.println("PointA:"+pointA);
	
		
	}

	}

