/*
Question 2: Write a Java program to check whether a triangle is valid or not.
Input:
A = 5, B = 6, C = 7

Output:
Valid Triangle

Explanation:
A triangle is valid if the sum of any two sides is greater than the third side
*/
import java.util.*;
class ValidTriangle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Three Side of Triangle");
		
		int A = xyz.nextInt();
		int B = xyz.nextInt();
		int C = xyz.nextInt();
		if(A+B>C && A+C>B && B+C>A)
		{
			System.out.println("Valid Triangle");
		}
		else
		{
			System.out.println("Not Valid");
		}
	}
}