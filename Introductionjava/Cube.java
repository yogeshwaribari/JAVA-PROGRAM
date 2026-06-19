/*
Question 19: Write a Java program that reads a number and displays its cube.
Input:
Number = 4

Output:
Cube = 64

Explanation:
The cube of a number is calculated by multiplying the number by itself three times.
4 × 4 × 4 = 64.
*/

import java.util.*;

class Cube 
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Cube");
		
		int C = xyz.nextInt();
		System.out.println("Cube =" + C * C * C);
	}
}