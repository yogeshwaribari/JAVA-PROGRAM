/*
Question 39: Write a program in java to find the smallest missing element from a sorted array?
Input:
Array = [0, 1, 3, 4, 5, 6, 7, 9]

Output:
Smallest Missing Element = 2

Explanation:
Traverse the array and compare each element with its expected index value; the first 
mismatch indicates the missing number.
*/
import java.util.Scanner;
class MissingSmaller
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int [8];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Smallest Missing Element");
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=i)
			{
				System.out.println(i);
				flag=true;
				break;
			}
		}
	}
}
