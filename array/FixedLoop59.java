/*
Question 59: Nested Loop with Fixed Inner Loop
Description:
Outer loop runs from 1 to n.
Inner loop runs exactly 5 times.
Input:
n = 4

Output:
Total iterations = 4 × 5 = 20

Explanation:
Inner loop is constant (5 times).
So total operations = 5n

Time Complexity: O(n)
*/
import java.util.Scanner;
class FixedLoop59
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Nth value");
		int n=xyz.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=5;j++)
			{
				cnt++;
			}
			
		}
		System.out.println("Total iterations ="+cnt);
	}
}