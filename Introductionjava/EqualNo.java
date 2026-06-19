/*
Question 43: Write a Java program to accept two integers and check whether they are equal.
Input:
A = 50
B = 50

Output:
Equal

Explanation:
If both numbers have the same value, they are equal; otherwise, they are not equal.
*/
import java.util.*;
class EqualNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter The Two Number");
		
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		System.out.println((a == b) ? "Equal" : "Not Equal");
	}
}