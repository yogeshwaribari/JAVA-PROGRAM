/*
Question 35: Write a Java program to check whether a number is divisible by both 5 and 11.
Input:
Number = 55

Output:
Divisible by 5 and 11

Explanation:
A number divisible by both 5 and 11 must give remainder 0 when divided by 5 and 11.
*/

import java.util.*;

class Divisible
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter A Number");
		
		int no = xyz.nextInt();
		System.out.println((no%5==0 && no%11==0) ? "Divisible by 5 and 11" : " Not Divisible by 5 and 11");
	}
	
}