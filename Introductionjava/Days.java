/*
Question 18: Write a Java program to convert days into years, months, and weeks.
Input:
Days = 400

Output:
Years = 1
Months = 1
Weeks = 1

Explanation:
1 year = 365 days.
After subtracting 365 days, the remaining days are divided into months (30 days each) and weeks (7 days each)
*/

import java.util.*;

class Days
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Days");
		
		int Days = xyz.nextInt();
		int Years = Days/365;
		int rem = Days%365;
		int Months = rem/30;
		rem = rem%30;
		int Weeks = rem/7;
		System.out.println("Years =" + Years + "\nMonths =" + Months + "\nWeeks =" +Weeks);
	}
}