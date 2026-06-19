/*
Question 22: Write a Java program to check whether two integer arrays are equal.
Two arrays are considered equal if:
Input:
Array1 = [10, 20, 30, 40]
Array2 = [10, 20, 30, 40]

Output:
Arrays are equal.

Explanation:
First compare the lengths of both arrays and if they are equal then compare elements at each index; 
if all elements match the arrays are equal otherwise they are not.
*/
import java.util.Scanner;
class EqualArr
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]=new int [4];
		int b[]=new int[4];
		System.out.println("Enter array1");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter array2");
		for(int i=0;i<b.length;i++)
		{
			b[i]=xyz.nextInt();
		}
		boolean flag = true; 
		for(int i=0;i<a.length;i++)
		{
				if(a[i]!=b[i])
				{
					flag=false;
					break;
	
				}	
		}
		if(flag){
		System.out.println("Array are equal");
		}
		else
		{
			System.out.println("Array Not equal");
		}
	}
}