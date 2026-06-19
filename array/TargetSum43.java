/*
Question 43: Write a program in java to find a subarray with given sum from the given array?
Input:
Array = [3, 4, -7, 1, 3, 3, 1, -4]
Target Sum = 7

Output:
Subarrays = [3,4], [3,4,-7,1,3,3], [1,3,3], [3,3,1]

Explanation:
Check all contiguous subarrays and calculate their sums to identify those equal to the target value.
///sir
*/
import java.util.Scanner;
class TargetSum
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[8];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter target sum");
		int tsum=xyz.nextInt();
		System.out.println("Subarrays");
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum==tsum)
				{
					for(int k=i;k<=j;k++)
					{
						System.out.print(a[k]+" ");
					}
				}
			}
			
		}
		
	}
}