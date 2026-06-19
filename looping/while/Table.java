/*
Question 9: Write a java program to print a multiplication table of any number.
Input:

Number = 5

Output:

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50

Explanation:

The program multiplies the given number by values from 1 to 10.
Each result is printed in table format.
*/
import java.util.Scanner;
class Table
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = xyz.nextInt();
		int i=1;
		while(i<=10)
		{
			int m = n*i;
			System.out.println(+n+"x"+i+"=" +m);
			i++;
		}
	}
}