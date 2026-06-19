/*
Question 20: Write a Java program to print all elements from an integer array that are 
greater than a given number.
Input:
Array = [10, 25, 5, 40, 18]
Given Number = 20

Output:
Elements greater than 20: 25 40

Explanation:
Traverse the array and compare each element with the given number; if the element is 
greater than the number, print it.
*/
import java.util.Scanner;
class GreaterNum
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter the greater number");
		int no=xyz.nextInt();
		System.out.println("Elements greater than "+no);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>no)
			{
				System.out.println(a[i]);
			}
		}
	}
}