/*
Question 19: Write a java program to find the sum of the first and last digit of a number.
Input:

Number = 1234

Output:

Sum = 5

Explanation:

First digit = 1
Last digit = 4
Sum = 1 + 4 = 5.
*/
import java.util.Scanner;
class FirstLastSum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int temp=no;
		int last= temp%10;
		while(temp>=10)
		{
			temp = temp/10;
		}
		int fir = temp;
		int sum = fir+last;
		System.out.println("Sum ="+sum);
	}
}