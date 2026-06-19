/*
Question 19: Given a score out of 100, print Excellent (?90), Good (?75), Average (?50), Poor (< 50) — using 
nested ternary operators.
Input:
Score = 82

Output:
Good

Explanation:
82 is greater than 75 but less than 90, so the grade is "Good".
Nested ternary operators are used instead of multiple if-else statements.
*/
import java.util.*;
class Score
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Score");
		int score = xyz.nextInt();
		if(score>=90 && score<=100)
		{
			System.out.println("Excellent");
		}
		else{
			if(score>=75 && score<90)
			{
				System.out.println("Good");
			}
			else
				if(score>=50 && score<75)
			{
				System.out.println("Average");
			}
			else if(score<50)
			{
				System.out.println("poor");
			}
		}
	}
}