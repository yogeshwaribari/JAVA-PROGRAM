/*
Question 30: Write a Java program to check whether a number is a multiple of both 3 and 5.
Input:
15

Output:
Multiple of both 3 and 5

Explanation:
A number divisible by both 3 and 5 must give remainder 0 when divided by 3 and by 5.
The logical AND operator is used to check both conditions.
*/
import java.util.*;
class CheckMultiple
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int a = xyz.nextInt();
		String msg = ((a%5==0)&&(a%3==0))? "Multiple of both 3 and 5" : "Not Multiple of both 3 and 5 ";
		System.out.println(msg);
	}
}