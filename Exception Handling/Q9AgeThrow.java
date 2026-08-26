/*Question 9: Write a Java program to print custom error messages using catch blocks.

Accept age from users. If age is negative, throw exceptions and print proper messages.
Asked In Practice Assignment
Input:
Enter age: -5

Output:
Invalid age entered

Explanation:
Custom error messages in catch blocks provide clear information about what went wrong.
When age is negative (-5),validation fails and exception is caught. 
Custom message "Invalid age entered" informs user about the specific problem instead of generic 
error.*/
import java.util.*;
class Q9AgeThrow
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=xyz.nextInt();
		try
		{
			if(age<0)
			{
				throw new Exception("Invalid age entered");
			}
			else
			{
				System.out.println("Age :"+age);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}