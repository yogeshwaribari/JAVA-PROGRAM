/*
Question 32: Write a java program to display 1 to nth Strong Number.
Input:
n = 3

Output:
1 2 145

Explanation:
1 and 2 are Strong Numbers because 1! = 1 and 2! = 2.
145 is also a Strong Number because 1! + 4! + 5! = 145.
*/
import java.util.Scanner;
class NStrong
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = xyz.nextInt();
		int cnt=0;
		
		for(int j=1;cnt<n;j++)
		{
			int temp=j;
			int sum=0;
			
			while(temp>0)
			{
				int d=temp%10;
				int f=1;
				for(int i=1;i<=d;i++)
				{
					f= f*i;
				}
				sum = sum+f;
				temp = temp/10;
			}
			if(sum==j)
			{
				System.out.println(j+" ");
				cnt++;
			}
		}
	}
}