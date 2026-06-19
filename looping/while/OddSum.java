/*
Question 8: Write a java program to find the sum of all odd numbers between
Input:

n = 10

Output:

Sum = 25

Explanation:

Odd numbers between 1 and 10 are 1, 3, 5, 7, 9.
Their sum is 1 + 3 + 5 + 7 + 9 = 25.
*/
import java.util.Scanner;
class OddSum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = xyz.nextInt();
		int i = 1;
		int sum =0;
		while(n>=i)
		{
			if(i%2!=0)
			{
				sum = sum+i;
			}
			i++;
		}
		System.out.println("Sum =" +sum);
	}
}