/*
Question 37: Write a java program to find LCM of two numbers.
Input:
Number1 = 12
Number2 = 18

Output:
LCM = 36

Explanation:
LCM is the smallest number that is divisible by both 12 and 18.
36 is divisible by both numbers.
*/
import java.util.Scanner;
class LCM 
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Two Number");
		int n1=xyz.nextInt();
		int n2=xyz.nextInt();
		int min;
		int gcd=1;
		if(n1>n2)
		{
			min=n1;
		}
		else
		{
			min=n2;
		}
		for(int i=1;i<=min;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
			gcd=i;
			}
		}
		int lcm=(n1*n2)/gcd;
		System.out.println("LCM ="+lcm);
	}
}