/*
Question 29: Write a java program to display 1 to nth Prime Number.
Input:

n = 5

Output:

2 3 5 7 11

Explanation:

Prime numbers are numbers divisible only by 1 and themselves.
The first 5 prime numbers are 2, 3, 5, 7, and 11.
*/
import java.util.Scanner;
class Nprime
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = xyz.nextInt();
		int cnt=0;
		
		for(int j=2;cnt<n;j++)
		{
			boolean flag = true;
			int i =2;
			while(i<=j/2)
			{
				if(j%i==0)
				{
					flag=false;
					break;
				}
				i++;
			}
		
			if(flag)
			{
				System.out.println(j + " ");
				cnt++;
			}
		}
		
	}
}