/*
Question 14: Write a Java program to swap two numbers using a third variable.
Input:
A = 5
B = 10

Output:
A = 10
B = 5

Explanation:
A temporary variable is used to store one value while swapping the numbers.
*/

import java.util.*;

class TwoSwap
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		
		int a,b,temp;
		a = xyz.nextInt();
		b = xyz.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("A =" + a + "\tB =" +b);
		
	}
}