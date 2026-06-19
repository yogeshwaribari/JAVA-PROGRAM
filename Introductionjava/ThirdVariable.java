/*
Question 15: Write a Java program to swap two numbers without using a third variable.
Input:
A = 4
B = 7

Output:
A = 7
B = 4
*/

import java.util.*;

class ThirdVariable
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		
		int A = xyz.nextInt();
		int B = xyz.nextInt();
		
		A = A + B;
		B = A - B;
		A = A - B;
		System.out.println("A =" + A + "\nB =" + B);
		
	}
}