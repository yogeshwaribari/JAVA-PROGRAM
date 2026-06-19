/*
Question 18: Write a java program to find the first and last digit of a number.
Input:

Number = 1234

Output:

First Digit = 1
Last Digit = 4

Explanation:

Last digit is found using number % 10.
First digit is found by dividing the number until it becomes a single digit.
*/
import java.util.Scanner;
class FirstLast
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int temp = no;
		int l = no%10;
		while(temp>=10)
		{
			temp= temp/10;
		}
		int f =temp;
		System.out.println("First="+f);
		System.out.println("Last="+l);
	}
}