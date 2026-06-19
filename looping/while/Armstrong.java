/*
Question 25: Write a java program to Check Number Is Armstrong Number or Not.

Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number
of digits gives the number itself.
For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit
Armstrong numbers and there are many more.
Input:

Number = 153

Output:

Armstrong Number

Explanation:

153 has 3 digits.
1³ + 5³ + 3³ = 1 + 125 + 27 = 153.
Since the result equals the original number, it is an Armstrong Number.
*/
import java.util.Scanner;
class Armstrong
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int t = no;
		int count =0;
		int sum=0;

		while(t>0)
		{
			count++;
			
			while(t>i)
			{
				p =p*d;
				i++;
			}
			sum = sum+p;
			t = t/10;
		}
		if(no==sum)
		{
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
	}
}