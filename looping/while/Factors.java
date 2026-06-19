/*
Question 17: Write a java program to find all factors of a number.
Input:

Number = 12

Output:

Factors: 1 2 3 4 6 12

Explanation:

A factor divides the number completely without remainder.
All numbers that divide 12 exactly are printed.
*/
import java.util.Scanner;
class Factors
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int i =1;
		while(i<=no)
		{
			if(no%i==0)
				System.out.println(i);
			i++;
		}
		
	}
}