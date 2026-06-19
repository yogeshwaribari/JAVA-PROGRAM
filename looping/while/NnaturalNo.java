/*
Question 6: Write a java program to find the sum of all natural numbers between 1 to n.
Input:

n = 5

Output:

Sum = 15

Explanation:

The program adds numbers from 1 to 5.
1 + 2 + 3 + 4 + 5 = 15.
*/
import java.util.Scanner;
class NnaturalNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = xyz.nextInt();
		int i = 0;
		int sum=0;
		while(n>=i)
		{
			sum = sum+i;
			i++;
		}
		System.out.println("Sum =" +sum);
	}
}