/*Question 18: Write a Java program to demonstrate exception propagation.

Create three methods where exception occurs in one method and propagates to main.
Asked In Practice Assignment
Input:
Enter divisor: 0

Output:
Exception propagated to main

Explanation:
When exception occurs in called method and is not caught, it propagates up the call stack. 
If method1 calls method2 which throws exception, and neither handles it, exception propagates 
to main. Main catches and handles the propagated exception.*/
import java.util.*;
class Q18Propagation
{
	static void method3(int b)
	{
		int c=10/b;
		System.out.println("Result :"+c);
	}
	static void method2(int b)
	{
		method3(b);
	}
	static void method1(int b)
	{
		method2(b);
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter divisor");
		int a=xyz.nextInt();
		
		try
		{
			method1(a);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception propagated to main");
		}
	}
}