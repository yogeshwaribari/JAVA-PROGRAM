/*
Question 18: Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
Input:
Score = 38

Output
Fail

Explanation:
If score ? 40 ? Pass
Otherwise ? Fail
*/
import java.util.*;
class PassFail
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Marks");
		int marks = xyz.nextInt();
		if(marks>=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}