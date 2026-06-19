/*
Question 22: Write a Java program to find the first and last digit of a three-digit number without using a loop.
Input:
456

Output:
First = 4
Last = 6
*/

import java.util.*;

class FirstLastDigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number");
		
		
		int no = xyz.nextInt();
	
		System.out.println("First =" + no/100 + "\nLast =" + no%10);
	}
}
