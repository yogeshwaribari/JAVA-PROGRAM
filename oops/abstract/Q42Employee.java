/*Question 42: Create an abstract class Employee and calculate salary for different types of 
employees.
Asked In Practice Question
Create an abstract class Employee with:

Abstract method calculateSalary()

Instance variable name

Create two subclasses:

FullTimeEmployee ? fixed monthly salary

PartTimeEmployee ? hourly rate × hours worked

The program should calculate and display salary based on employee type.

Input
Employee Type: FullTime
Name: Vivek
Monthly Salary: 30000
Output
Employee Name: Vivek
Salary: 30000*/
import java.util.*;
abstract class Employee
{
	String name;
	Employee(String name)
	{
		this.name=name;
	}
	abstract void calculateSalary();
}
class FullTimeEmployee extends Employee
{
	int monthlysalary;
	FullTimeEmployee(String name,int monthlysalary)
	{
		super(name);
		this.monthlysalary=monthlysalary;
	}
	public void calculateSalary()
	{
		System.out.println("Name :"+name);
		System.out.println("Monthly Salary :"+monthlysalary);
	}
}
class PartTimeEmployee extends Employee
{
	int rate,hwork;
	PartTimeEmployee(String name,int rate,int hwork)
	{
		super(name);
		this.rate=rate;
		this.hwork=hwork;
	}
	public void calculateSalary()
	{
		int salary=rate*hwork;
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
	}
	
}
class Q42Employee
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.FullTime \n 2.PartTime ");
		System.out.println("Enter your choice");
		int choice=xyz.nextInt();
		xyz.nextLine();
		Employee e;
		System.out.println("Enter Employee Name");
			String name=xyz.nextLine();
		switch(choice)
		{
			case 1:
			//xyz.nextLine();
			System.out.println("Enter monthly salary");
			int monthlysalary=xyz.nextInt();
			e=new FullTimeEmployee(name,monthlysalary);
			e.calculateSalary();
			break;
			
			case 2:
			System.out.println("Enter hourly rate");
			int rate=xyz.nextInt();
			System.out.println("Enter hourly worked");
			int hwork=xyz.nextInt();
			e=new PartTimeEmployee(name,rate,hwork);
			e.calculateSalary();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
		
		
	}
}