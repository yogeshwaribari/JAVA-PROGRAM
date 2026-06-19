/*
Question 28: Write a java program to find the union array of two unsorted arrays.
Input:
Array1 = [1, 2, 3]
Array2 = [2, 3, 4, 5]

Output:
Union Array = [1, 2, 3, 4, 5]

Explanation:
Combine both arrays and remove duplicate elements so that each value appears only once.
*/
import java.util.Scanner;
class Union
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[4];
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
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
	
		for(int i=0;i<b.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				c[k]=b[i];
				k++;
			}
		}
		System.out.println("Union elements");
		for(int i=0;i<k;i++)
		{
			System.out.println(c[i]);
		}
	}
}
