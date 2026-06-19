/*
Question 18: Write a Java program to check whether a given array is empty or not.
Input :- Array elements: { } 
Explanation
1. Every array has a predefined property called length.
2. If array.length == 0, then the array is empty.
3. Otherwise, the array contains elements.
Output :- Array is empty
*/
import java.util.Scanner;
class EmptyArray
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = xyz.nextInt();
		int a[] = new int [size];
		
			if(size==0)
			{
				System.out.println("Array is Empty");
			}
			else
			{
				System.out.println("Array is not Empty");
			}
	}
}