/*
Question 4: Write a Java program to check whether a number is positive, negative or zero.
Input:
Number = -5

Output:
Negative

Explanation:
If number > 0 ? Positive
If number < 0 ? Negative
If number = 0 ? Zero
*/
import java.util.*;
class PositiveNeg
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int no = xyz.nextInt();
		if(no>0)
		{
			System.out.println("Number is Positive");
		}
		else if(no<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is Zero");
		}
	}
}