/*Question 12: Write a Java program to use the throw keyword.

Accept a number from the user. If the number is negative, throw ArithmeticException manually.
Asked In Practice Assignment
Input:
Enter number: -10

Output:
Negative number not allowed

Explanation:
Throw keyword manually throws an exception when certain conditions are not met. 
When user enters negative number (-10), throw statement explicitly throws ArithmeticException. 
This allows explicit error handling for invalid conditions detected by application.*/
import java.util.*;
class Q12Negative
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=xyz.nextInt();
		try
		{
			if(n<0)
			{
				throw new ArithmeticException("Negative number not allowed");
			}
			else
			{
				System.out.println("Number :"+n);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

