/*Question 114: Write a Java program to calculate employee salary using interface.
Asked In Practice Assignment
Create an interface Employee with method calculateSalary().
Implement in FullTimeEmployee and PartTimeEmployee.

Full-time ? salary = fixed + bonus
Part-time ? salary = hours × rate

Input:
Enter type (1-FullTime, 2-PartTime): 2
Enter hours: 5
Enter rate per hour: 200

Output:
Salary : 1000*/
import java.util.*;
interface Employee
{
	void calculateSalary();
}
class FullTimeEmployee implements Employee
{
	int fixed,bonus;
	FullTimeEmployee(int fixed,int bonus)
	{
		this.fixed=fixed;
		this.bonus=bonus;
	}
	public void calculateSalary()
	{
		int salary=fixed+bonus;
		System.out.println("Salary :"+salary);
	}
}
class PartTimeEmployee implements Employee
{
	int hours,rate;
	PartTimeEmployee(int hours,int rate)
	{
		this.hours=hours;
		this.rate=rate;
	}
	public void calculateSalary()
	{
		int salary=hours*rate;
		System.out.println("Salary :"+salary);
	}
}

class Q114Employee
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your choice 1.FullTimeEmployee 2.PartTimeEmployee");
		int choice=xyz.nextInt();
		Employee e;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Fixed salary");
			int fixed=xyz.nextInt();
			System.out.println("Enter bonus");
			int bonus=xyz.nextInt();
			e=new FullTimeEmployee(fixed,bonus);
			e.calculateSalary();
			break;
			
			case 2:
			System.out.println("Enter Hours");
			int hours=xyz.nextInt();
			System.out.println("Enter rate");
			int rate=xyz.nextInt();
			e=new PartTimeEmployee(hours,rate);
			e.calculateSalary();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}