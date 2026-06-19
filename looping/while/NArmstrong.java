/*
Question 33: Write a java program to display 1 to nth Armstrong Number
Input:
n = 4

Output:
0 1 153 370

Explanation:
0 and 1 are Armstrong Numbers.
153 and 370 are Armstrong Numbers because the sum of cubes of their digits equals the num
*/
import java.util.Scanner;
class NArmstrong
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = xyz.nextInt();
		int cnt = 0;
		
		for(int j=0;cnt<n;j++)
		{
			int temp=j;
			int sum = 0;
			int f=0;
			while(temp>0)
			{
				int d=temp%10;
				f=d*d*d;
				sum=sum+f;
				temp=temp/10;
			}
			if(sum==j)
			{
				System.out.println(j+" ");
				cnt++;
			}	
		}
	}
	
}