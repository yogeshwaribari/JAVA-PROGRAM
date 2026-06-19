/*
Question 28: Write a Java program to calculate the net salary of an employee.
Input:
Basic = 20000
HRA = 10%
DA = 5%
Tax = 2%

Output:
Net Salary = 22600

Explanation:
HRA and DA are calculated as percentages of the basic salary and added to it.
Tax is deducted after adding allowances to compute the final net salary.
*/

import java.util.*;

class Salary
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int Basic = xyz.nextInt(),
		HRA = xyz.nextInt(),
		DA = xyz.nextInt(),
		Tax = xyz.nextInt();
		HRA = (Basic*HRA)/100;
		DA = (Basic*DA)/100;
		int gross = Basic+HRA+DA;
		Tax = (gross*Tax)/100;
		int Netsalary = gross-Tax;
		System.out.println("Net Salary = " + Netsalary);

		
		
		
	}
}	