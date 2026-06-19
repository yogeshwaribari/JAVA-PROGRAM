/*
Question 42: Write a program in java to to print next greater elements in a given unsorted array. 
Elements for which no greater element exist, consider next greater element as -1.
Input:
Array = [5, 3, 10, 9, 6, 13]

Output:
Next Greater Elements = [10, 10, 13, 13, 13, -1]

Explanation:
For each element search the right side of the array and find the first element greater than it; 
if none exists return -1.
*/
import java.util.*;
class NexGrater42
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]=new int [6];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Next Greater Elements");
		for(int i=0;i<a.length;i++)
		{
			int next=-1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					next=a[j];
					break;
				}
				
			}
			System.out.println(next);
		}
		
	}
}
