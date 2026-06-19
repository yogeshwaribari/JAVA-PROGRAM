/*
Question 17: Write a java program to find the maximum between two numbers.
Input:
Number1 = 45
Number2 = 30

Output
Maximum number = 45

Explanation:
If Number1 > Number2, print Number1.
Otherwise, print Number2.
*/
import java.util.*;
class MaxTwo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1= xyz.nextInt();
		int n2 = xyz.nextInt();
		if(n1>n2)
		{
			System.out.println("Maximum number = "+n1);
		}
		else
		{
			System.out.println("Maximum number = "+n2);
		}
	}
}