/*
Question 14: Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result,
thus avoiding duplicates.
*/
import java.util.Scanner;
class DuplicatEle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]= new int[7];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Unique elements");
		int size=a.length;
		for(int i=0;i<size-1;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=j;k<size-1;k++)
					{
						a[k]=a[k+1];
					}
					j--;
					size--;
				}
			}
		}
		
		System.out.println("after removing data");
		for(int i=0;i<=size-1;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}
}