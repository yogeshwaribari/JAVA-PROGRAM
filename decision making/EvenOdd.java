/*
Question 1: Write a Java program to check whether a number is even or odd.
Input:
Number = 8

Output:
Even

Explanation:
If a number is divisible by 2, it is Even. Otherwise, it is Odd.
*/
import java.util.*;
class EvenOdd
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int no = xyz.nextInt();
		if(no % 2 == 0)
		{
			System.out.println(no+" is Even");
		}
		else
		{
			System.out.println(no+" is Odd");
		}
	}
}