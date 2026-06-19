/*
Question 42: Write a Java program to check whether a person is eligible to vote.
Input:
Age = 19

Output:
Eligible to Vote

Explanation:
The minimum voting age is 18 years.
If age ? 18, the person is eligible.
*/

import java.util.*;
class Voting
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter The Age");
		
		int age = xyz.nextInt();
		System.out.println((age>=18) ? "Eligible to Vote" : "Not Eligible to Vote");
	}
}