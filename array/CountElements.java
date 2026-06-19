/*
Question 27: Write a java program to count the frequency of each element in a given array.
Input:
Array = [1, 2, 2, 3, 3, 3, 4]

Output:
1 ? 1 time
2 ? 2 times
3 ? 3 times
4 ? 1 time

Explanation:
For each element in the array, count the number of occurrences by comparing it with all other elements.
*/
import java.util.Scanner;
class CountElements
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]=new int[7];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int cnt=1;
		int i=0;
		for( i=1;i<a.length;i++)
		{
			
				if(a[i]==a[i-1])
				{
					++cnt;
				}
				else
				{
					System.out.println(a[i-1]+" "+cnt+ "Times");
					cnt=1;
				}
		}
		
	}
}