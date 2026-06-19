/*
Question 21: Write a java program to check whether a number is neon or not neon without using loop.
Input:
Number = 9

Output
Neon Number

Explanation:
Square of 9 = 9 × 9 = 81
Sum of digits of 81 = 8 + 1 = 9
Since sum (9) equals the original number (9), it is a Neon Number.
*/
import java.util.*;
class Neon{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = xyz.nextInt();
		int sq = no*no;
		int sum = (sq/10) + (sq%10);
		if(sum == no)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not Neon Number");
		}
	}
}