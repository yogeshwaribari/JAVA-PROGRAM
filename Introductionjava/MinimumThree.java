/*
Question 46: Write a Java program to find the maximum between two numbers.
Input:
A = 6
B = 3
C = 9

Output:
Minimum = 3

Explanation:
The program compares all three numbers using conditional statements and prints the smallest value.
*/

import java.util.*;
class MinimumThree
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		
		int A = xyz.nextInt();
		int B = xyz.nextInt();
		int C = xyz.nextInt();
		System.out.println((A<B && A<C) ? "Minimum = " +A : (B<A && B<C) ? "Minimum = " +B : "Minimum = " +C);
		
	}
}