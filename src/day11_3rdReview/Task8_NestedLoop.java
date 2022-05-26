package day11_3rdReview;

public class Task8_NestedLoop {

	public static void main(String[] args) {
/*# Nested Loop Tasks
## Task A - Print the following (Nested Loop)

Write java program that print this on the console

```text
1   2   3   4   5   6   7   8   9  
2   4   6   8   10  12  14  16  18  
3   6   9   12  15  18  21  24  27  
4   8   12  16  20  24  28  32  36  
5   10  15  20  25  30  35  40  45  
6   12  18  24  30  36  42  48  54  
7   14  21  28  35  42  49  56  63  
8   16  24  32  40  48  56  64  72  
9   18  27  36  45  54  63  72  81 
 */
	
		for (int x = 1; x <= 9; x++) {
		    for (int y = 1; y <= 9; y++) {
		        System.out.printf("%4d", x * y);
		    }
		    System.out.println();
		}
}
}