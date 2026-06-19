/*
Question 52: Write a java program to display top three value from array.
Input:
Array = [78, 90, 90, 86, 85, 92, 70, 92]

Output:
Top Three Values = 92, 90, 86

Explanation:
Traverse the array and identify the three largest distinct values by comparing elements and 
updating the first, second, and third maximum values accordingly while ignoring duplicates.
*/
import java.util.Scanner;
class TopThreeVal52
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
		int first = a[0];
		int second =a[0];
		int third = a[0];
		System.out.println("Top Three Values");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==first || a[i]==second || a[i]==third)
				continue;
			
			if(a[i]>first)
			{
				third=second;
				second=first;
				first=a[i];
			}
			else if(a[i]>second)
			{
				third=second;
				second=a[i];
			}
			else if(a[i]>third)
			{
				third=a[i];
			}
			
		}
		System.out.print(first+ " " +second+ " " +third);
	}
}
