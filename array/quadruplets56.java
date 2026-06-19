/*
Question 56: Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], 
nums[b], nums[c], nums[d]] such that:
? 0 <= a, b, c, d < n
? a, b, c, and d are distinct.
? nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.
Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]


Constraints:
? 1 <= nums.length <= 200
? -109 <= nums[i] <= 109
? -109 <= target <= 109
*/
import java.util.*;
class quadruplets56
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter aaray elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter target");
		int tar=xyz.nextInt();
		Arrays.sort(a);
		for(int i=0;i<a.length-3;i++)
		{
			 if(i > 0 && a[i] == a[i-1]) continue;
			 
			for(int j=i+1;j<a.length-2;j++)
			{
				if(j>i+1 && a[j]==a[j-1]) continue;
				
				for(int k=j+1;k<a.length-1;k++)
				{
					if(k>j+1&&a[k]==a[k-1]) continue;
					
					for(int y=k+1;y<a.length;y++)
					{
						if(y>k+1&& a[y]==a[y-1]) continue;
						
						if(a[i]+a[j]+a[k]+a[y]==tar)
						{
							System.out.println(a[i]+" "+a[j]+ " "+a[k]+" "+a[y]);
							break;
						}
					}
				}
			}
			
		}
		
	}
}