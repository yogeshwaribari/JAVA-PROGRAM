/*
Question 12: Write a Java program to calculate simple interest.
Input:
Principal = 1000
Rate = 5
Time = 2

Output:
Simple Interest = 100

Explanation:
Simple Interest formula:
SI = (Principal × Rate × Time) / 100
Applying the formula gives 100.
*/

import java.util.*;

class SimpleInterest
{
	public static void main (String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter The Principal , Rate , & Time");
		
		int Pri = xyz.nextInt(), rate = xyz.nextInt(), Time = xyz.nextInt();
		int SI = (Pri * rate * Time) / 100;
		
		System.out.println("Simple Interest = " + SI);
		
		
		
	}
}