/*
Question 32: Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input:
Array = [10, 12, 15, 17, 20]

Output:
Array = [5, 12, 5, 17, 5]

Explanation:
Traverse the array and check each element; if an element is divisible by 5 replace it with 5 
otherwise keep the element unchanged.
*/
import java.util.Scanner;
class Multiples5
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Result array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%5==0)
			{
				a[i]=5;
			}
			System.out.print(" "+a[i]);
		}
	}
}