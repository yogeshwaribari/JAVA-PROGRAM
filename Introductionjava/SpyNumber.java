/*
Question 26: Write a Java program to check whether a number is a Spy number.
Input:
1412

Output:
Spy Number

Explanation:
A Spy number is a number where the sum of digits equals the product of digits.
Sum = 1 + 4 + 1 + 2 = 8
Product = 1 × 4 × 1 × 2 = 8.
*/

import java.util.*;

class SpyNumber
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int no = xyz.nextInt();
		int sum = (no/1000) + ((no%1000)/100) + (no/1000) + (no%10);
						//1				//4			//1			//2
		int Product = (no/1000) * (no%1000)/100 * (no/1000) * (no%10);
		
		System.out.println( sum == Product ? "Spy Number" : "Not Spy Number");
		
	
	}
	
}