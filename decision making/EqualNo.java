/*
Question 13: Write a java program to accept two integers and check whether they are equal or not.
Input:
Number1 = 15
Number2 = 15

Output
Both numbers are equal

Explanation:
If Number1 == Number2, print equal.
Otherwise, print not equal
*/
import java.util.*;
class EqualNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int num1 = xyz.nextInt();
		int num2 = xyz.nextInt();
		if(num1 == num2)
		{
			System.out.println("Equal Number");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}