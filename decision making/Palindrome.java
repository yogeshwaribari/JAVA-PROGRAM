/*
Question 22: Write a java program to check whether a number is palindrome or not.
Input:
Number = 121

Output
Palindrome Number

Explanation:
Reverse of 121 is 121.
Since original number equals reversed number, it is a Palindrome.
*/
import java.util.*;
class Palindrome
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		int no = xyz.nextInt();
		int rev = (no/100)*100+((no%100)/10)*10+(no/100);
		if(rev==no)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}