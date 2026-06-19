/*
Question 28: Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
Input:

Number = 1412

Output:

Spy Number

Explanation:

Sum = 1 + 4 + 1 + 2 = 8
Product = 1 × 4 × 1 × 2 = 8
Since sum equals product, it is a Spy Number.
*/
import java.util.Scanner;
class SpyNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int sum=0;
		int product=1;
		while(no>0)
		{
			int rem = no%10;
			sum = sum+rem;
			product = product*rem;
			no = no/10;

		}
		if(sum==product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not Spy Number");
		}
	}
}