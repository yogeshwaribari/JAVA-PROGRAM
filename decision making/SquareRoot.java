/*
Question 20: Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square.
Input:
Number = 49

Output
Perfect Square

Explanation:
Square root of 49 is 7, which is an integer.
Therefore, 49 is a Perfect Square.
If the square root contains a decimal value, then it is not a Perfect Square.
*/
import java.util.*;
class SquareRoot
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = xyz.nextInt();
		double srt=Math.sqrt(no);
		
		if((srt*srt)==no)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Not Perfect");
		}
	}
}