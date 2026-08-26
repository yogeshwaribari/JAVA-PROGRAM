/*Question 6: Write a Java program to demonstrate finally block execution.

Perform division of two numbers and display result. Whether an exception occurs or not, 
the finally block must execute.
Asked In Practice Assignment
Input:
Enter number1: 15
Enter number2: 3

Output:
Result is: 5
Finally block executed

Explanation:
Finally block always executes regardless of whether exception occurred or not. 
It is used for cleanup operations like closing files or connections. In this case, finally block 
executes after division is performed and result is displayed.*/
import java.util.*;
class Q6FinallyBlock
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number1");
		int a=xyz.nextInt();
		System.out.println("Enter number2");
		int b=xyz.nextInt();
		try
		{
			int c=a/b;
			System.out.println("Result :"+c);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Arithmetic Exception handled");
		}
		finally{
			System.out.println("Finally block executed");
		}
	}
}