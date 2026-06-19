/*
Question 46: Write a program in java to find the maximum circular subarray sum of a given array.
Input:
Array = [10, 8, -20, 5, -3, -5, 10, -13, 11]

Output:
Maximum Circular Sum = 2

Explanation:
A circular subarray may wrap around the end of the array and the maximum sum is determined by considering 
both normal and circular subarrays.
*/
import java.util.Scanner;
class MaxSubArr46{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[9];
		System.out.println("Enter array Element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int k=2,sum=0;
		for(int i=0;i<k;i++)
		{
			sum=sum+a[i];
		}
		int max=sum;
		for(int i=k;i<a.length;i++)
		{
			sum=sum+a[i]-a[i-k];
			if(sum<max)
			{
				max=sum;
			}
			System.out.println(max);
		}
	}
}