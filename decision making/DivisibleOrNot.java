/*
Question 5: Write a Java program to check whether a number is divisible by 5 and 11 or not.
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
If number % 5 == 0 AND number % 11 == 0.
*/
import java.util.*;
class DivisibleOrNot
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num = xyz.nextInt();
		if(num % 5 ==0 && num % 11 == 0)
		{
			System.out.println("Divisible by 5 and 11");
		}
		else
		{
			System.out.println("Not Divisible");
		}
	}
}