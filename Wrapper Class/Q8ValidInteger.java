/*Question 8: Write a Java program to check whether the given string is a valid integer using 
wrapper class.
Asked In Practice Assignment
Input:
Enter value: 45A

Output:
Invalid Integer value

Explanation:
Read string input "45A". Attempt to convert using Integer.parseInt(). Since string contains 
letter 'A', it is not purely numeric. parseInt() throws NumberFormatException. Catch exception 
and print "Invalid Integer value". If string was "45" (all digits), it would be valid.*/
import java.util.*;
class Q8ValidInteger
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter value");
		String str=xyz.nextLine();
		
		try
		{
			Integer a=Integer.parseInt(str);
			System.out.println("Valid Integer Value");
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Invalid Integer value");
		}
	}
}