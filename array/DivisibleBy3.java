/*
Question 30: Replace All Elements Divisible by 3 with -1.
Input:
Array = [3, 6, 7, 9, 10]

Output:
Array = [-1, -1, 7, -1, 10]

Explanation:
Traverse the array and if an element is divisible by 3 replace it with -1 while keeping other 
elements unchanged.
*/
import java.util.Scanner;
class DivisibleBy3
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
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%3==0)
			{
				a[i]=-1;
			}
			System.out.println(a[i]);
		}
	}
}