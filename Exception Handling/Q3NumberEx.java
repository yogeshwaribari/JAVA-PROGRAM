/*Question 3: Write a Java program to handle NumberFormatException while converting string into 
integer.

Accept a number in string format from the user and convert it into integer using parsing. 
If the input is not numeric, handle the exception.
Asked In Practice Assignment
Input:
Enter number: ABC

Output:
Invalid number format

Explanation:
NumberFormatException is thrown when Integer.parseInt() or similar methods receive 
non-numeric string input. When user enters 'ABC' instead of a number, parsing fails because
alphabetic characters cannot be converted to integers. Catch NumberFormatException and display 
message that input must be numeric. This exception handling prevents program crash and provides 
user feedback.*/
import java.util.*;
class Q3NumberEx
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number");
		String str=xyz.nextLine();
		try{
			int n=Integer.parseInt(str);
			
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Invalid number format");
			System.out.println("Error :"+ex.getMessage());
		}
	}
}