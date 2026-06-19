/*
Question 16: Write a java program to find power of a number.
Input:

Base = 2
Exponent = 3

Output:

Result = 8

Explanation:

2 raised to the power 3 means 2 × 2 × 2.
The result is 8.
*/
import java.util.Scanner;
class Power
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Base and Exponent");
		int b= xyz.nextInt();
		int e = xyz.nextInt();
		int result = 1;
		while(e>0)
		{
			 result=result*b;
			 e--;
		}
		System.out.println("Result=" +result);
	}
}