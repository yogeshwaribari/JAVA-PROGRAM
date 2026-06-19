/*
Question 70: Binary Search (Sorted Array)
Description:
Search target using binary search.
Input:
[1,3,5,7,9]
Target = 7

Output:
Found

Explanation:
Each step halves search space.

Time Complexity: O(log n)
*/
import java.util.Scanner;
class BinarySear70
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter target");
		int target=xyz.nextInt();
		int index=-1;
		int L=0 ,R=a.length-1,mid=0;
		while(L<=R)
		{
			mid=L+(R-L)/2;
			if(a[mid]==target)
			{
				index=mid;
				break;
			}
			if(a[mid]<target)
			{
				L=mid+1;
			}
			else
			{
				R=mid-1;
			}
		}
		if(index!=-1)
		{
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
	}
}