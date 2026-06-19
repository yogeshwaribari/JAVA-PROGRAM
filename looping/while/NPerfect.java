/*
Question 30: Write a java program to display 1 to nth Perfect Number
Input:

n = 2

Output:

6 28

Explanation:

The first perfect number is 6.
The second perfect number is 28.
Both numbers are equal to the sum of their proper divisors.
*/
import java.util.Scanner;
class NPerfect
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = xyz.nextInt();
		int cnt =0;
		
		for(int j=1;cnt<n;j++)
		{
			int sum=0;
			for(int i=1;i<=j/2;i++)
			{
				if(j%i==0)
				{
					sum = sum+i;
				}
			}
			if(sum==j)
			{
				System.out.println(j+" ");
				cnt++;
			}
        }
    }
}