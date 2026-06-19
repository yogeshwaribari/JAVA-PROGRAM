/*
Question 24: Write a Java program to check whether a number is a Neon number or not.
Input:
9

Output:
Neon Number

Explanation:
A Neon number is a number where the sum of digits of its square is equal to the number itself.
9² = 81 ? 8 + 1 = 9.
*/

import java.util.*;

class Neon
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int no = xyz.nextInt();
		int square = no*no;
		int sum = (square/10) + (square%10);
		
		String msg = (no == sum) ? "Neon Number" : "Not Neon Number";
		System.out.println(msg);
	}
}