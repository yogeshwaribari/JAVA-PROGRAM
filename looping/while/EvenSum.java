/*
Question 7: Write a java program to find the sum of all even numbers between 1 to n.
Input:

n = 10

Output:

Sum = 30

Explanation:

Even numbers between 1 and 10 are 2, 4, 6, 8, 10.
Their sum is 2 + 4 + 6 + 8 + 10 = 30.
*/
import java.util.Scanner;
class EvenSum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = xyz.nextInt();
		int i = 1;
		int sum =0;
		while(i<=n)
			
		{
			if(i%2==0)
			{
				sum = sum +i;
			}
			i++;
		}
		System.out.println("Sum =" +sum);
	}
}