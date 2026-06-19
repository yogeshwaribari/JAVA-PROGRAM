/*
Question 35: Check whether a given employee is eligible for bonus:

Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus
Input:
Years of Service = 7
Salary = 50000

Output:
Bonus = 2500

Explanation:
If service > 5 years ? 5% bonus
5% of 50000 = 2500
If service ? 5 ? No Bonus
*/
import java.util.Scanner;
class Employee
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter years of Service");
		int y= xyz.nextInt();
		System.out.println("Enter a Salary");
		int s = xyz.nextInt();
		if(s>5)
		{
			s = (s*5)/100;
			System.out.println("Bonus = "+s);
		}
		else
		{
		System.out.println("No Bonus");
		}
	}
}