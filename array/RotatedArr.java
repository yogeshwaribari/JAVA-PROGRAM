/*
Question 24: Write a program in java to rotate an array by N positions ?
Input:
Array = [0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27]
Position = 4

Output:
Rotated Array = [12, 14, 18, 20, 22, 25, 27, 0, 3, 6, 9]

Explanation:
Split the array into two parts at the given position and place the second part first 
followed by the first part to complete the rotation.
*/
import java.util.Scanner;
class RotatedArr
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = xyz.nextInt();
		int a[]=new int [size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter position");
		int pos=xyz.nextInt();
		System.out.println("rotate array");
		for(int i=pos;i<size;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		for(int i=0;i<pos;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}
}