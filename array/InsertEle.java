/*
Question 12: Write a program in java to insert an element at desired position from an array.
Input the size of array : 6

Input 5 elements in the array in ascending order :
1 2 3 4 5

Input the position where to insert : 2
Value : 200

Expected Output : The new list is : 1 2 200 3 4 5
*/
import java.util.Scanner;
class InsertEle
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		//System.out.println("Enter array size");
		//int index = xyz.nextInt();
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter Position");
		int pos=xyz.nextInt();
		System.out.println("Enter Value");
		int val = xyz.nextInt();
		for(int i=(a.length-2);i>=pos;i--)
		{
			a[i+1]=a[i];
		}
		a[pos]=val;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
