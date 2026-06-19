/*
Question 58: Print Only Even Numbers up to n
Description:
Given an integer n, print all even numbers from 1 to n using a loop that increments by 2.
Input:
n = 10

Output:
2 4 6 8 10
Total iterations: 5

Explanation:
The loop runs n/2 times.
But in Big-O notation, constants are ignored.

Time Complexity: O(n)
*/
import java.util.Scanner;
class EvenTime58
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Nth value");
		int n=xyz.nextInt();
		int cnt=0;
		for(int i=2;i<=n;i+=2)
		{
			
				System.out.print(i+" ");
				cnt++;
			
		}
		System.out.println("\nTotal iterations: "+cnt);
	}
}