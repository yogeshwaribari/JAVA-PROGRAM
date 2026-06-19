/*
Question 64: Find Maximum in Array
Description:
Find the largest element in an array.
Input:
[3,8,2,9,1]

Output:
Max = 9

Explanation:
Each element compared once.

Time Complexity: O(n)
*/
import java.util.Scanner;
class MaxEleTime64
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]={3,8,2,9,1};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}	
		}
		System.out.println("Max ="+max);
	}
}