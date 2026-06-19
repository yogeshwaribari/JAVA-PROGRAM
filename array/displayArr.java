/*
Question 1: Write a Java program to input an array & display it.
Input:
Array Size = 5
Array Elements = 10 20 30 40 50
Output:
10 20 30 40 50
Explanation:
? First, we take the size of the array from the user.
? Then, elements are entered one by one into the array.
? Finally, using a loop, we display all elements in the same order they were entered.
*/
import java.util.Scanner;
class displayArr
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter array Size");
		int index = xyz.nextInt();
		int a[]=new int[index];
		System.out.println("Enter Array Elements");
		for(int i=0; i<index;i++)
		{
			a[i]= xyz.nextInt();
		}
		for(int i=0;i<index;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}
}