/*Question 19: Design an employee payroll system.
Create a base class Employee with attributes name and basicSalary.
Create a child class Payroll that adds hra and da.
Use super keyword to initialize parent class.
Store 3 employees using an array of objects and calculate gross salary.
Asked In Practice Assignment
Description
This mini project demonstrates a complete academic system with grading
logic using inheritance.
Input
Enter number of Employees: 3

Enter Name: Suresh
Enter Basic Salary: 30000
Enter HRA: 5000
Enter DA: 3000

Enter Name: Meena
Enter Basic Salary: 40000
Enter HRA: 6000
Enter DA: 4000

Enter Name: Kiran
Enter Basic Salary: 35000
Enter HRA: 5500
Enter DA: 3500
Output
Name: Rahul, Percentage: 80.0%, Grade: A
Name: Priya, Percentage: 65.0%, Grade: B
Name: Aman, Percentage: 35.0%, Grade: Fail*/
import java.util.*;
class Employee
{
	String name;
	int basicSalary;
	void setData(String name,int basicSalary)
	{
		this.name=name;
		this.basicSalary=basicSalary;
	}
}
class Payroll extends Employee
{
	int hra,da;
	void Data(String name,int basicSalary,int hra,int da)
	{
		super.setData(name,basicSalary);
		this.hra=hra;
		this.da=da;
	}
	void getData()
	{
		int gross=basicSalary+hra+da;
		System.out.println("Name :"+name+ ", Gross Salary :"+gross);
	}
}
class Q19Employee
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Employee");
		int n=xyz.nextInt();
		Payroll p[]=new Payroll[n];
		
		for(int i=0;i<n;i++)
		{
			p[i]=new Payroll();
			System.out.println("Enter name");
			String name=xyz.next();
			//xyz.nextLine();
			System.out.println("Enter Basic Salary");
			int basicSalary=xyz.nextInt();
			System.out.println("Enter HRA");
			int hra=xyz.nextInt();
			System.out.println("Enter DA");
			int da=xyz.nextInt();
			p[i].Data(name,basicSalary,hra,da);
		}
		for(int i=0;i<n;i++)
		{
			p[i].getData();
		}
	}
}