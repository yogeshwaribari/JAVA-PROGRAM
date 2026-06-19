/*
Question 66: Check if Number is Even
Description:
Check if a number is even or odd.
Input:
n = 25

Output:
Odd

Explanation:
Only one operation.

Time Complexity: O(1)
*/
import java.util.Scanner;
class EvenOddTime66
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number");
		int n=xyz.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
	}
}