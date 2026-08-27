/*Question 15: Write a Java program to handle exceptions while reading array elements.

Accept array size and elements. Handle exceptions if the user enters invalid datatype.
Asked In Practice Assignment
Input:
Enter size: 3
Enter elements: 10 A 30

Output:
Invalid input for array element

Explanation:
When reading array elements, NumberFormatException or InputMismatchException can occur if 
user enters non-numeric data. When user enters "A" instead of number, exception is caught and 
message informs about invalid input type expected.*/
import java.util.*;
class Q15InvalidArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements");
		try
		{
			for(int i=0;i<size;i++)
			{
				a[i]=xyz.nextInt();
			}
			for(int i=0;i<size;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Invalid input for array element");
		}
	}
}