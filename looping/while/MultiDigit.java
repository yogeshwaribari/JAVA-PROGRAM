/*
Question 12: Write a java program to calculate the product of digits in a number.
Input:

Number = 1234

Output:

Product of digits = 24

Explanation:

Digits are extracted one by one.
1 × 2 × 3 × 4 = 24.
*/
import java.util.Scanner;
class MultiDigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int mul =1;
		while(no>0)
		{
			int d = no%10;
			mul = mul*d;
			no = no/10;
		}
		System.out.println("Multiplication = " +mul);
	}
}