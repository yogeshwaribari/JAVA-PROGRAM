/*Question 32: Create a base class Employee with attributes name and salary.
Use this keyword for initialization.

Create a child class Developer that adds bonus.
Create another child class SeniorDeveloper that adds stockBonus.

Use constructor chaining (this() + super()).
Store 2 employees using array and calculate total salary.
Asked In Practice Assignment
Description
Demonstrates multilevel inheritance + this keyword + constructor
chaining with salary aggregation.
Input
Enter number of Employees: 2

Enter Name: Ravi
Enter Salary: 50000
Enter Bonus: 5000
Enter Stock Bonus: 10000

Enter Name: Priya
Enter Salary: 60000
Enter Bonus: 7000
Enter Stock Bonus: 15000
Output
Name: Ravi, Total Salary: 65000
Name: Priya, Total Salary: 82000*/
import java.util.*;
class Employee
{
	String name;
	int salary;
	Employee()
	{
		this("unknown",0);
	}
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
class Developer extends Employee
{
	int bonus;
	Developer()
	{
		this("unknown",0,0);
	}
	Developer(String name,int salary,int bonus)
	{
		super(name,salary);
		this.bonus=bonus;
	}
}
class SeniorDeveloper extends Developer
{
	int stockBonus;
	SeniorDeveloper()
	{
		this("unknown",0,0,0);
	}
	SeniorDeveloper(String name,int salary,int bonus,int stockBonus)
	{
		super(name,salary,bonus);
		this.stockBonus=stockBonus;
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Total Salary :"+(salary+bonus+stockBonus));
	}
}
class Q32EmployeeSal
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Employee");
		int n=xyz.nextInt();
		SeniorDeveloper s[]=new SeniorDeveloper[n];
		
		for(int i=0;i<n;i++)
		{
			
			xyz.nextLine();
			System.out.println("Enter Name");
			String name=xyz.nextLine();
			System.out.println("Enter Salary");
			int salary=xyz.nextInt();
			System.out.println("Enter Bonus");
			int bonus=xyz.nextInt();
			System.out.println("Enter Stock Bonus");
			int stockBonus=xyz.nextInt();
			s[i]=new SeniorDeveloper(name,salary,bonus,stockBonus);
		}
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	}
}