/*
Question 67: Count All Pairs in Array
Description:
Given array of size n, print all possible pairs (i,j).
Input:
n = 3

Output:
(1,2) (1,3) (2,3)

Explanation:
Nested loops.

Time Complexity: O(n²)
*/
import java.util.Scanner;
class PossiblePairTime67
{
	public static void main(String x[])
	{
		Scanner xyz =new Scanner(System.in);
		System.out.println("Enter number");
		int n=xyz.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				System.out.print("("+i+","+j+")");
			}
		}
	}
}