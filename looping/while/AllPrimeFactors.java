/*
Question 38: Write a java program to find all prime factors of a number.
Input:
Number = 20

Output:
Prime Factors: 2 2 5

Explanation:
20 = 2 × 2 × 5
All these factors are prime numbers.
*/
import java.util.Scanner;
class AllPrimeFactors
{
	public static void main(String x[])
	{
		Scanner xyz= new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = xyz.nextInt();
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+ " ");
				n=n/i;
			}
		}
	}
}