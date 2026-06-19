/*
Question 20: Write a Java program to compute the sum of digits of an integer.
Input:
123

Output:
6

Explanation:
Each digit is separated using modulus and division operations.
1 + 2 + 3 = 6.
*/

import java.util.*;

class DigitSum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Digit");
		
		int Digit = xyz.nextInt();
		int sum = 0;
		int a = Digit%10; //3
		sum = sum + a;  //0+3
		int b = Digit/10; //12 
		int rem = b%10; //2
		b = b/10; //1
		sum = a+rem+b;
		System.out.println("Sum =" + sum);
		
	}
}