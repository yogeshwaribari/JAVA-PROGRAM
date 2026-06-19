/*
Question 49: Write a java program to merge of two given array.
Input:
Array1 = [1, 2, 3, 4, 5]
Array2 = [6, 7, 8, 9, 10]

Output:
Merged Array = [1, 10, 2, 9, 3, 8, 4, 7, 5, 6]

Explanation:
Insert elements alternately by picking one element from the beginning of the first array 
and one from the end of the second array.
*/
import java.util.Scanner;
class alternatelyMerg49
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int [5];
		int b[]=new int [5];
		int c[]=new int [a.length+b.length];
		System.out.println("enter array1 elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("enter array2 elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=xyz.nextInt();
		}
		int i=0;
		int j=b.length-1;
		int k=0;
		while(i<a.length && j>=0)
		{
			c[k++]=a[i++];
			c[k++]=b[j--];
		}
		System.out.println("merged array");
		for(int m=0;m<c.length;m++)
		{
			System.out.println(c[m]);
		}
		
	}
}