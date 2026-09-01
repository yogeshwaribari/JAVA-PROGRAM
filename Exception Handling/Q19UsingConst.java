/*Question 19: Write a Java program to handle exceptions in constructors.

Create a class constructor accepting numbers and perform division. Handle exceptions 
inside the constructor.
Asked In Practice Assignment
Input:
Enter number: 10
Enter divisor: 0

Output:
Exception handled in constructor

Explanation:
Constructors can throw exceptions when initialization fails. When constructor performs 
division by zero, ArithmeticException is thrown and caught in try-catch block within constructor 
itself. This ensures object creation handles errors properly.*/
import java.util.*;
class Const
{
	Const(int a,int b)
	{
		try
		{
			int c=a/b;
			System.out.println("Result :"+c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception handled in constructor");
		}
	}
	
}
class Q19UsingConst
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number");
		int a=xyz.nextInt();
		System.out.println("Enter divisor");
		int b=xyz.nextInt();
		Const c=new Const(a,b);
			
	}
}