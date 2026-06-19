/*
Question 36: Write a java program to find HCF (GCD) of two numbers.
Input:
Number1 = 12
Number2 = 18

Output:
HCF = 6

Explanation:
6 is the largest number that divides both 12 and 18 without remainder.
Therefore, HCF is 6.
*/
import java.util.Scanner;
class HCD
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		int n1 = xyz.nextInt();
		int n2 = xyz.nextInt();
		int gcd = 1;
		int min;
		if(n1<n2)
		{
			min=n1;
		}
		else 
		{
			min = n2;
		}
		for(int i=2; i<=min;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("HCF = "+gcd);
	}
}