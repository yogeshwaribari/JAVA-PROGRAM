/*
Question 71: Print Upper Triangular Matrix
Description:
Print elements where j ? i.
Input:
n = 3

Output:
1
1 1
1 1 1

Time Complexity: O(n²)
*/
import java.util.Scanner;
class UpperTriTime71
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Nth value");
		int n= xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("1 ");
			}
			System.out.println();//new line
		}
		
	}
}