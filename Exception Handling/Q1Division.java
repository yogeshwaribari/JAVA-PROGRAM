/*Question 1: Write a Java program to handle ArithmeticException when a number is divided by zero.

Accept two integer numbers from the user and perform division. If the denominator is zero, 
handle the exception and display a proper message instead of terminating the program.
Asked In Practice Assignment
Input:
Enter first number: 10
Enter second number: 0

Output:
Exception occurred: Cannot divide by zero

Explanation:
ArithmeticException is thrown when dividing by zero. Use try-catch block to catch this exception. 
In the catch block, display an error message explaining that division by zero is not allowed. 
This prevents the program from crashing and allows graceful error handling.*/
import java.util.*;
class Q1Division
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a=xyz.nextInt();
		b=xyz.nextInt();
		try{
		int c=a/b;
		System.out.println("Result :"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occurred: Cannot divide by zero");
		}
		
	}
}