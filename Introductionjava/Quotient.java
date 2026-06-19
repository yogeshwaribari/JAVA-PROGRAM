/*
Question 29: Write a Java program to find quotient and remainder using arithmetic operators.
Input:
Dividend = 20
Divisor = 3

Output:
Quotient = 6
Remainder = 2

Explanation:
The division operator (/) gives the quotient.
The modulus operator (%) gives the remainder.
*/

import java.util.*;

class Quotient
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Dividend and Divisor");
		
		int d1 = xyz.nextInt();
		int d2 = xyz.nextInt();
		System.out.println("Quotient =" + (d1/d2) + "\nRemainder" + (d1%d2));
	}
}