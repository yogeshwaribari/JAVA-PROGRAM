/*
Question 24: Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial of the digits equals the number itself. 1, 2, 145,
Input:

Number = 145

Output:

Strong Number

Explanation:

1! + 4! + 5! = 1 + 24 + 120 = 145.
Since the sum equals the number, it is a Strong Number
*/
import java.util.Scanner;
class StrongNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int t = no;
		int d;
		int sum =0;
		while(t>0)
		{
			d = t%10;
			int i =1;
			int f =1;
			while(i<=d)
			{
				f = f*i;
				i++;
			}
			sum = sum+f;
			t = t/10;	
		}
		if(no==sum)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}
}