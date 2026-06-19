/*
Question 61: Loop that Divides n by 2 Each Time
Description:
Given n, divide n by 2 until it becomes 1.
Input:
n = 16

Output:
16 ? 8 ? 4 ? 2 ? 1
Total steps: 4

Explanation:
Each iteration halves the value.
Number of steps = log?(n)

Time Complexity: O(log n)
*/
import java.util.Scanner;
class DivideTwo61
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Nth value");
		int n=xyz.nextInt();
		int cnt=0;
		System.out.println(" "+n);
			while(n>1)
			{
				
				n=n/2;
				cnt++;
				System.out.println(" "+n);
			}
		
		System.out.println("Total steps:"+cnt);
	}
}