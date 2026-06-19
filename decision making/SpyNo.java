/*
Question 23: Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
Input:
Number = 1412

Output
Spy Number

Explanation:
Sum = 1 + 4 + 1 + 2 = 8
Product = 1 × 4 × 1 × 2 = 8
Since sum = product = 8, it is a Spy Number.
*/
import java.util.*;
class SpyNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = xyz.nextInt();
		int sum = (num/1000)+(num%1000)/100+(num/1000)+(num%10);
		int product = (num/1000)*(num%1000)/100*(num/1000)*(((num%1000)%100)%10);
		if(sum == product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not Spy Number");
		}
			
	}
}