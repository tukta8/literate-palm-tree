package day07_2ndReview;

public class HomeworkSolutionF {

	public static void main(String[] args) {
/*
 * ## Task F - Upper Lower or Number

Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z )
or number (0-9). if the input letter is lowercase, print `<letter> is a lowercase alphabet`
if the letter is the uppercase, print `<letter> is a uppercase alphabet`
if the letter is a number, print `<letter> is a number`
if the letter is not an alphabet and number, print `this input cannot be computed`

Tips:

- you can refer to ASCII table
- use `nextLine().charAt(0)` or `next().charAt(0)` to receive `char` input from user

**Example:**

```text
Please enter the letter:
> A
'A' is a uppercase alphabet

Please enter the letter:
> 3
'3' is a number

Please enter the letter:
> %
this input cannot be computed
```/ 
 */
		String s = "TuktaMANGAN16";
        int upper = 0, lower = 0, number = 0;
 
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
         
            
       
 
        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("Number : " + number);
    
}}}