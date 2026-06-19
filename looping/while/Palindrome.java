/*
Question 14: Write a java program to check whether a number is palindrome or not.
Input:

Number = 121

Output:

Palindrome

Explanation:

The reversed number of 121 is also 121.
Since original and reversed numbers are equal, it is a palindrome.
*/
import java.util.Scanner;
class Palindrome
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int ori=no;
		int rev=0;
		while(no>0)
		{
			int d = no%10;
			rev=rev*10+d;
			no=no/10;
		}
		if(rev==ori)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}