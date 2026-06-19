/*
Question 16: Write a java program to find a minimum between three numbers.
Input:
Number1 = 9
Number2 = 4
Number3 = 7

Output
Minimum number = 4

Explanation:
Compare all three numbers using nested if-else statements to determine the smallest number
*/
import java.util.*;
class MinThree
{
	public static void main(String x[])
	{
	Scanner xyz = new Scanner(System.in);
	System.out.println("Enter the Three Number");
	int a = xyz.nextInt();
	int b = xyz.nextInt();
	int c = xyz.nextInt();
	if(a<b && a<c)
	{
		System.out.println(a+" is Minimum");
	}
	else
	{
		if(b<c)
		{
			System.out.println(b+" is Minimum");
		}
		else{
			System.out.println(c+" is Minimum");
		}
	}
	
	
	}
}