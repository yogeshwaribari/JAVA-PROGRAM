/*
Question 31: Replace First and Last Element with 0.
Input:
Array = [5, 3, 7, 2]

Output:
Array = [0, 3, 7, 0]

Explanation:Update the first and last positions of the array with 0 and 
leave the middle elements unchanged.
*/
import java.util.Scanner;
class FirstLast{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size");
		int size = xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Result array");
		for(int i=0;i<size;i++)
		{
			a[0]=0;
			a[size-1]=0;
			System.out.print(" "+a[i]);
		}
		
	}
}
