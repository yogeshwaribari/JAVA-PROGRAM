/*
Question 7: Write a java program to display the reverse array.
Input : Array = {1, 2, 3, 4, 5}
Output : Reverse array = {5, 4, 3, 2, 1}
Explanation :
The last element becomes the first, and the first becomes the last by traversing from the end 
to the start.
*/
import java.util.Scanner;
class ReverseArr
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter array size");
		int index = xyz.nextInt();
		int a[] = new int[index];
		System.out.println("Enter array elements");
		for(int i=0;i<index;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Reverse Number");
		for(int i=index-1;i>=0;i--)
		{
		System.out.print(" "+a[i]);	
		}
	}
}