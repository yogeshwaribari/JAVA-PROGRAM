/*
Question 40: Write a Java program to sort a given array in ascending & descending order.
Input:
Array = [12, 5, 9, 34, 1]

Output:
Ascending Order = [1, 5, 9, 12, 34]
Descending Order = [34, 12, 9, 5, 1]

Explanation:
Arrange elements from smallest to largest for ascending order and reverse the order for descending.
*/
import java.util.*;
class AscenDescen
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]=new int [5];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Ascending Order");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println("\nDescending Order");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(" "+a[i]);
		}
	}
}