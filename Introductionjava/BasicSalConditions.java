/*
Question 44: Write a Java program to calculate gross salary based on basic salary conditions.
Input:
Basic Salary = 18000

Output:
Gross Salary = 34650

Explanation:
Gross salary is calculated by adding HRA and DA to the basic salary according to the given salary slab conditions.
*/
import java.util.*;
class BasicSalConditions
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		
		int salary = xyz.nextInt();
		int HRA = xyz.nextInt();
		int DA = xyz.nextInt();
		HRA = (salary*HRA)/100;
		DA = (salary*DA)/100;
		int Gross = salary+HRA+DA;
		System.out.println("Gross Salary = " + Gross);
	}
}