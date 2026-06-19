/*
Question 60: Print n² Pattern
Description:
Print an n × n matrix using nested loops.
Input:
n = 3

Output:
Total operations: 9

Explanation:
Outer loop runs n times
Inner loop runs n times
Total operations = n × n

Time Complexity: O(n²)
*/
import java.util.Scanner;
class MatrixTime60
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Nth value");
		int n=xyz.nextInt();
		int t=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				t++;
			}
		}
		System.out.println("Total operations:"+t);
	}
}