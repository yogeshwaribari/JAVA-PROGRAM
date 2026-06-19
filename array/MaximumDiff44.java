/*
Question 44: Write a program in java to find out the maximum difference between any two 
elements such that larger element appears after the smaller number.
Input:
Array = [7, 9, 5, 6, 13, 2]

Output:
Maximum Difference = 8

Explanation:
Find a pair where the smaller element appears before the larger element and the difference between 
them is maximum.
*/
import java.util.Scanner;
class MaximumDiff44
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int [6];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int maxdiff=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int diff=a[j]-a[i];
				if(diff>maxdiff)
				{
					maxdiff=diff;
				}
			}
		}
		System.out.print("Maximum difference = "+maxdiff);
	}
}
