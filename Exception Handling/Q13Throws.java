/*Question 13: Write a Java program to use throws keyword.

Create a method that performs division and declares exceptions using throws keyword. 
Handle it in the main method.
Asked In Practice Assignment
Input:
Enter number1: 25
Enter number2: 0

Output:
Exception handled in main method

Explanation:
Throws keyword in method signature declares that method may throw exceptions.
 When called method throws exception due to division by zero, calling method (main) catches and
 handles it. This defers exception handling to calling method.*/
 import java.util.*;
 class Q13Throws
 {
	static void divide(int a,int b)throws ArithmeticException
	 {
		 int c=a/b;
		 System.out.println("Result :"+c);
	 }
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter number 1");
		 int a=xyz.nextInt();
		 System.out.println("Enter number 2");
		 int b=xyz.nextInt();
		 
		 try
		 {
			 divide(a,b);
		 }
		 catch(ArithmeticException ex)
		 {
			 System.out.println("Exception handled in main method");
			 
		 }
	 }
 }