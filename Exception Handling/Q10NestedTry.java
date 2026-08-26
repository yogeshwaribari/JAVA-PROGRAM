/*Question 10: Write a Java program to demonstrate nested try blocks.

Create nested try blocks where the inner block handles ArithmeticException and outer 
handles ArrayIndexOutOfBoundsException.
Asked In Practice Assignment
Input:
Enter number: 10
Enter divisor: 0

Output:
Inner exception handled

Explanation:
Nested try blocks allow handling different exceptions at different levels. 
Inner try block catches ArithmeticException when divisor is zero. Outer try block can catch 
ArrayIndexOutOfBoundsException if it occurs. This hierarchical exception handling provides 
fine-grained control.*/
import java.util.*;
class Q10NestedTry
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=xyz.nextInt();
		System.out.println("Enter divisor");
		int b=xyz.nextInt();
		try
		{
			
			try{
				int c=a/b;
				System.out.println("Result :"+c);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Inner exception handled");
			}
			int d[]=new int[1];
			d[0]=a;
			d[1]=b;
			System.out.println("Result of array :"+d[0]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Outer exception handled");
		}
	}
}