/*Question 28: Create a base class Company with attribute companyName.
Create a child class Department that adds deptName.
Create another child class Employee that adds salary.

Use constructor chaining (super()).
Store 3 employees using array and display full details.
Asked In Practice Assignment
Description
Shows constructor chaining across multiple classes with organizational data.
Input
Enter number of Employees: 3

Enter Company: TCS
Enter Department: IT
Enter Salary: 40000

Enter Company: Infosys
Enter Department: HR
Enter Salary: 35000

Enter Company: Wipro
Enter Department: Finance
Enter Salary: 45000
Output
Company: TCS, Dept: IT, Salary: 40000
Company: Infosys, Dept: HR, Salary: 35000
Company: Wipro, Dept: Finance, Salary: 45000*/
import java.util.*;
class Company
{
	String companyName;
	Company(String companyName)
	{
		this.companyName=companyName;
	}
}
class Department extends Company
{
	String deptName;
	Department(String companyName,String deptName)
	{
		super(companyName);
		this.deptName=deptName;
	}
}
class Employee extends Department
{
	int salary;
	Employee(String companyName,String deptName,int salary)
	{
		super(companyName,deptName);
		this.salary=salary;
	}
	void display()
	{
		System.out.println("Company :"+companyName+", Department :"+deptName+", Salary :"+salary);
	}
}
class Q28CompanyData
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Employee ");
		int n=xyz.nextInt();
		Employee e[]=new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter company Name");
			String companyName=xyz.next();
			System.out.println("Enter Department Name");
			String deptName=xyz.next();
			System.out.println("Enter Salary");
			int salary=xyz.nextInt();
			e[i]=new Employee(companyName,deptName,salary);
		}
		for(int i=0;i<n;i++)
		{
			e[i].display();
		}
	}
}