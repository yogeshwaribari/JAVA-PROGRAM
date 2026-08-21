/*Question 2: Write a Java program to handle ArrayIndexOutOfBoundsException while 
accessing array elements.

Create an integer array of fixed size and allow the user to enter an index number. 
If the index is beyond array size, handle the exception properly.
Asked In Practice Assignment
Input:
Enter array size: 5
Enter index to access: 7

Output:
Exception occurred: Index is out of range

Explanation:
ArrayIndexOutOfBoundsException occurs when accessing array index that does not exist. 
If user enters index 7 but array size is 5 (valid indices 0-4), exception is thrown. 
Catch this exception and display user-friendly message about valid range.*/
import java.util.*;
class Q2ArraySize
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=xyz.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter access of index");
		int inx=xyz.nextInt();
		
		try{
			System.out.println("Accessing data :"+arr[inx]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception occurred: Index is out of range");
			System.out.println("Valid index is 0 to "+(size-1));
		}
	}
}