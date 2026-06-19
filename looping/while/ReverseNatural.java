/*
Question 2: Write a java program to print all natural numbers in reverse (from n to 1). 
using a while loop.
Input:

n = 5

Output:

5 4 3 2 1

Explanation:

The program starts from n and decreases the number by 1 each time.
The loop runs until the number becomes 1.
*/
import java.util.Scanner;
class ReverseNatural
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = xyz.nextInt();
		while(n>=1)
		{
			System.out.println(n);
			n--;
		}
	}
}