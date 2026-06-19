/*
Question 13: Write a Java program to calculate compound interest.
Input:
Principal = 2000
Rate = 10
Time = 2

Output:
Compound Interest = 420

Explanation:
Compound Interest is calculated using the formula:
CI = P(1 + R/100)^T ? P
*/

import java.util.*;

class CompoundInterest
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Principal , Rate , & Time");
		
		int P = xyz.nextInt(), R = xyz.nextInt(), T = xyz.nextInt();
		double amount = P * Math.pow(1 + R/100.0,T);
		double CI = amount-P;
		
		System.out.println("Compound Interest = " + CI);
			
	}
}