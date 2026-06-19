/*
Question 48: Write a java program to merge of two given array.
Input:
Array1 = [1, 2, 3, 4, 5]
Array2 = [6, 7, 8, 9, 10]

Output:
Merged Array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Explanation:
Copy all elements of the first array followed by elements of the second array into a new array.
*/
import java.util.Scanner;
class Merge48
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[a.length+b.length];
		System.out.println("Enter array1 elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter array2 elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		
		System.out.println("Merged array");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}
