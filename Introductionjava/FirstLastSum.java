/*
Question 23: Write a Java program to calculate the sum of the first and last digit without using a loop.
Input:
123

Output:
4

Explanation:
First digit = 1
Last digit = 3
Sum = 1 + 3 = 4.
*/

import java.util.*;

class FirstLastSum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int no,first,last;
		no = xyz.nextInt();
		first = no/100;
		last = no%10;		
		System.out.println("First = " + first + "\tLast = " +last);
		System.out.println("Sum = " + (first + last));
	}
}