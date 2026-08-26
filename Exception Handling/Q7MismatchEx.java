/*Question 7: Write a Java program to handle InputMismatchException.

Accept integer input from the user. If the user enters a character instead of an integer, 
handle exceptions.
Asked In Practice Assignment
Input:
Enter number: A

Output:
Invalid input type

Explanation:
InputMismatchException is thrown by Scanner when input does not match expected data type. 
When user enters character "A" for integer input, exception is thrown. Catch this exception and 
display message about correct input format required.
*/
import java.util.*;
class Q7MismatchEx
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number");
		
		try{
			int a=xyz.nextInt();
			System.out.println("Number :"+a);
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Invalid input type");
			System.out.println(ex);
		}
	}
}