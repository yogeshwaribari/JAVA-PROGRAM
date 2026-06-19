/*
Question 50: Write a Java program to check whether the absolute difference between two numbers is greater than 10.
Input:
m = 25
n = 12

Output:
Difference is greater than 10

Explanation:
Absolute difference = |25 ? 12| = 13.
Since 13 is greater than 10, the condition is tru
*/
import java.util.*;
class AbsoluteDiff
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two number");
		
		int m = xyz.nextInt();
		int n = xyz.nextInt();
		
		String msg = (((m-n)>10) ? "Difference is greater than 10" : "Difference is less than 10");
		System.out.println(msg);
	}
}