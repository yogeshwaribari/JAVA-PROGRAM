/*
Question 26: Write a java program to count all pairs of elements in an array whose sum is 
equal to a given number.
Input:
Array = [1, 5, 7, -1, 5]
Sum = 6

Output:
Number of Pairs = 3

Explanation:
Check all possible pairs in the array and count those pairs whose sum equals the given value.
*/
import java.util.*;
class SumPair
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int cnt=0;
		System.out.println("Enter sum");
		int sum = xyz.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				cnt++;
			}	
		}
		System.out.println("Number of Pairs = "+cnt);
	}
}