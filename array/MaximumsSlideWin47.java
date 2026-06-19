/*
Question 47: Write a program in java to find the maximum for each and every contigious subarray of size k from a 
given array.
Input:
Array = [1, 3, 6, 21, 4, 9, 12, 3, 16, 10]
K = 4

Output:
Maximums = [21, 21, 21, 21, 12, 16, 16]

Explanation:
Slide a window of size K across the array and determine the maximum element within each window.
*/
import java.util.Scanner;
class MaximumsSlideWin47
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int k=4;
		System.out.println("MAximum result array");
		for(int i=0;i<=a.length-k;i++)
		{
			int max=a[i];
			for(int j=i;j<i+k;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
				}
			}
			System.out.print(max + " ");
		}
	}
}