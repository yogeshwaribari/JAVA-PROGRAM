/*
Question 19: Given an integer array, replace all the negative numbers in the array 
with 0 and print the updated array.
Input:
Array = [5, -3, 7, -1, 0, -6, 4]

Output:
Updated Array = [5, 0, 7, 0, 0, 0, 4]

Explanation:
Traverse the array and check each element; if the element is negative replace it with 0, 
otherwise keep it unchanged, then print the modified array.
*/
import java.util.Scanner;
class ReplaceNegative
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter array size");
		int size = xyz.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<size;i++)
		{
			a[i]= xyz.nextInt();
		}
		System.out.println("Updated array");
		for(int i=0;i<size;i++)
		{
			if(a[i]<0)
			{
				a[i]=0;
			}
			System.out.print(" "+a[i]);
		}
	}
}