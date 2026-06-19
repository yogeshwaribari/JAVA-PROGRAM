/*
Question 1: Write a java program to print all natural numbers from 1 to n. using while loop.
Input:
n = 5

Output:
1 2 3 4 5

Explanation:
The program starts from 1 and prints numbers one by one until it reaches n.
The while loop continues as long as the number is less than or equal to n.
*/
import java.util.Scanner;
class NaturalNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = xyz.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
			
	}
}