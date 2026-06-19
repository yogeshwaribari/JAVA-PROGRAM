/*
Question 47: Write a Java program to find the minimum among three numbers.
Input:
A = 14
B = 9

Output:
Maximum = 14

Explanation:
The program compares both numbers and prints the larger value.
*/
import java.util.*;
class MaxTwo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		
		int A = xyz.nextInt();
		int B = xyz.nextInt();
		System.out.println((A>B) ? "Maximum = " +A : "Maximum = " +B);
		
	}
}
