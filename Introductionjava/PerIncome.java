/*
Question 52: Write a Java program to check eligibility based on percentage and income.
Input:
Percentage = 78
Income = 180000

Output:
Eligible

Explanation:
Eligibility condition:
Percentage ? 75 and Income < 200000.
Both conditions are satisfied.
*/
import java.util.*;
class PerIncome
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Percentage And Income");
	
		int per = xyz.nextInt();
		int income = xyz.nextInt();
		String msg = ((per>75 && income < 200000) ? "Eligible" : "Not Eligible");
		System.out.println(msg);
	}
}