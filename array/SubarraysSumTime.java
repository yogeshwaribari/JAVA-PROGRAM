/*
Question 73: Sum of All Subarrays
Description:
Given an array of size n, calculate the sum of all possible subarrays.
A subarray is a contiguous part of an array.
Input:
n = 3
Array = [1, 2, 3]

Output:
Subarrays:
[1] ? 1
[1,2] ? 3
[1,2,3] ? 6
[2] ? 2
[2,3] ? 5
[3] ? 3

Total Sum = 20

Explanation:
We use two loops:
First loop selects starting index.
Second loop selects ending index and keeps adding elements.

Number of subarrays = n(n+1)/2
For n=3 ? 6 subarrays.

Time Complexity: O(n²)
Because two nested loops generate all subarray
*/
import java.util.Scanner;
class SubarraysSumTime
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=xyz.nextInt();
		int a[]=new int[n];
		int tsum=0;
		System.out.println("Enter your array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Subarrays");
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum=sum+a[k];
					System.out.print(a[k]+" ");
					
				}
				System.out.println("="+sum);
				tsum=tsum+sum;
			}
			
		}
		System.out.println("Total Sum ="+tsum);
		
	}
}