/*
Question 13: Write a java program to enter a number and print its reverse.
Input:

Number = 1234

Output:

Reversed Number = 4321

Explanation:

The program extracts the last digit and builds the reverse number.
Each digit is added in reverse order.
*/
import java.util.Scanner;
class Reverse
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int re =0;
		while(no>0)
		{
			 int d = no%10;
			 re = re *10+d;
			 no = no/10;
		}
		System.out.println(re);
			
	}
}