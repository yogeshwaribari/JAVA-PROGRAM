/*Question 16: Write a Java program to handle multiple exceptions in a single catch.

Use Java multi catch feature to handle ArithmeticException and NumberFormatException.
Asked In Practice Assignment
Input:
Enter number: XYZ

Output:
Exception handled using multi catch

Explanation:
Multi-catch feature (Java 7+) allows catching multiple exception types in single catch block 
using pipe (|) operator. Single catch block handles both ArithmeticException and
 NumberFormatException. This reduces code duplication when same handling logic applies to
 multiple exceptions.*/
 import java.util.*;
 class Q16MultiException
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		 System.out.println("Enter number");
		 String n=xyz.nextLine();
		 try
		 {
			 int num=Integer.parseInt(n);
			 int c=100/num;
			 System.out.println("Result :"+c);
			 
		 }
		 catch(ArithmeticException | NumberFormatException ex)
		 {
			 System.out.println("Exception handled using multi catch");
		 }
	 }
 }