/*
Question 55: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, 
i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:

Input: nums = [0,1,1]
Output: [ ]

Explanation: The only possible triplet does not sum up to 0.

Constraints:
? 3 <= nums.length <= 3000
? -105 <= nums[i] <= 105
*/
import java.util.Scanner;
class TripalTarget55
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter array elemnts");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Output array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;j++)
			{
				for(int k=i+2;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==0)
					{
						System.out.println(a[i]+ " "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}
}