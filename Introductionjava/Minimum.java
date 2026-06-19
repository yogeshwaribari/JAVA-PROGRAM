/*
Question 45: Write a Java program to find the minimum between two numbers.
Input:
A = 8
B = 12

Output:
Minimum = 8

Explanation:
The program compares both numbers and prints the smaller one.
*/
import java.util.*;
class Minimum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		
		int A = xyz.nextInt();
		int B = xyz.nextInt();
		System.out.println((A<B) ? "Minimum = " +A : "Minimum = " +B);
		
	}
}
