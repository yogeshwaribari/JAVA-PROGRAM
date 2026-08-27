/*Question 14: Write a Java program to rethrow an exception.

Catch exceptions in one method and rethrow it to the calling method.
Asked In Practice Assignment
Input:
Enter number1: 10
Enter number2: 0

Output:
Exception rethrown and handled

Explanation:
Rethrowing allows one method to catch exception, perform cleanup, then pass it to caller for 
further handling. When method catches ArithmeticException and rethrows it, main method catches 
the rethrown exception and displays appropriate message.*/
import java.util.*;
class Q14Rethrow
{
	static void divide(int a,int b) throws ArithmeticException
	{
		try
		{
			int c=a/b;
			System.out.println("Result :"+c);
		}
		catch(ArithmeticException ex)
		{
			throw ex;
		}
	}
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number 1");
	int a=xyz.nextInt();
	System.out.println("Enter number 2");
	int b=xyz.nextInt();
	
	try{
		divide(a,b);
	}
	catch(ArithmeticException ex)
	{
		System.out.println("Exception rethrown and handled");
	}

	}
}