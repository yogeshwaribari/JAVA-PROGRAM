/*
Question 31: Write a Java program to check whether a given number is even or odd.
Input:
Number = 12

Output:
Even

Explanation:
A number is even if it is divisible by 2 (remainder 0).
If the remainder is not 0, the number is odd.
*/
import java.util.*;
class EvenOdd
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int no = xyz.nextInt();
		String msg = ((no%2)==0) ? "Even" : "Odd";
		System.out.println(msg);
	}
}