/*
Question 77: Merge Sort Complexity Analysis
Description:
Analyze time complexity of Merge Sort algorithm.

Input:
Array = [5, 2, 4, 1]

Output:
Sorted Array = [1, 2, 4, 5]

Explanation:
Merge Sort:
Divides array into two halves
Recursively sorts them
Merges sorted halves

Recurrence relation:
T(n) = 2T(n/2) + n

Using Master Theorem:
Time Complexity = O(n log n)

Because:

log n levels of recursion

n work at each level*/
import java.util.*;
class MergeSort77
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[4];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		
		
		System.out.println("Sorted array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
}