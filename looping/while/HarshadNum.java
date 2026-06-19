/*
Question 39: Write a Java program to check whether a given number is a Harshad number (i.e., divisible by the 
sum of its digits) for numbers from 1 to n.
Input:

n = 20

Output:

1 2 3 4 5 6 7 8 9 10 12 18 20

Explanation:

For example,
18 ? Sum of digits = 1 + 8 = 9
18 ÷ 9 = 2 (divisible)
*/
import java.util.Scanner;
class HarshadNum
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter n value");
		int n = xyz.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			int temp=i;
			int sum=0;
			while(temp>0)
			{
				int d=temp%10;
				sum = sum+d;
				temp = temp/10;
			}
			if(i%sum==0)
			{
				System.out.println(" "+i);
			}

		}
		
	}
}