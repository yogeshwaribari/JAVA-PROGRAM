/*
Question 26: Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
Input:

Number = 9

Output:

Neon Number

Explanation:

9² = 81
8 + 1 = 9
Since the sum equals the number, it is a Neon Number.
*/
import java.util.Scanner;
class NeonNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int sq = no*no;
		int sum=0;
		while(sq>0)
		{
			 int rem = sq%10;
			 sum = sum+rem;
			 sq=sq/10;	 
		}
		if(no==sum)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not Neon Number");
		}
		
		
	}
}