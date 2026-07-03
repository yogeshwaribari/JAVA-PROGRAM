/*Q8. A software company wants to automate its employee payroll system. Create a Java 
application using Class, Object, Parameterized Constructor, Array of Objects, Setter and Getter 
methods.
Store details of multiple employees and perform various logical CRUD and reporting operations.
Explanation
Create an Employee class having the following attributes:
employeeId, employeeName, department, designation, basicSalary, experience, rating.
Create
• Parameterized Constructor
• Getter Methods
• Setter Methods
Store all employee objects inside an array of objects.
Perform Following 9 Operations –
1. Add Nth Employees & display it.
2. Search Employee by Employee ID.
3. Update Employee Salary using Employee experience.
4. Delete Employee Record.
5. Find Highest Salary Employee.
6. Display Employees whose Experience is greater than 5 Years.
7. Increase Salary by 10% for Employees having Rating greater than or equal to 4.5.
8. Display Department-wise Total Salary.
Example
HR : 150000 IT : 350000 Testing : 120000
9. Sort Employees in Descending Order of Salary.*/
import java.util.*;
class Employee{
	int empId;
	String empName; 
	String dept; 
	String designation; 
	int basicSalary; 
	int experience;
	double rating;
	
	Employee(int empId,String empName,String dept,String designation,int basicSalary,int experience,
	double rating)
	{
		this.empId=empId;
		this.empName=empName;
		this.dept=dept;
		this.designation=designation;
		this.basicSalary=basicSalary;
		this.experience=experience;
		this.rating=rating;
	}
	void display()
	{
		System.out.println("EmpId :"+empId);
		System.out.println("empName :"+empName);
		System.out.println("dept :"+dept);
		System.out.println("designation :"+designation);
		System.out.println("basicSalary :"+basicSalary);
		System.out.println("experience :"+experience);
		System.out.println("rating :"+rating);
	}
}
class Q8
{
	public static void main(String x[])
	{
		Employee e[]=new Employee[4];
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Enter Id");
			int empid=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter Name");
			String empName=xyz.nextLine();
			System.out.println("Enter Department");
			String dept=xyz.nextLine();
			System.out.println("Enter designation");
			String designation=xyz.nextLine();
			xyz.nextLine();
			System.out.println("Enter BasicSalary");
			int basicSalary=xyz.nextInt();
			System.out.println("Enter experience");
			int experience=xyz.nextInt();
			System.out.println("Enter Rating");
			double rating=xyz.nextInt();
			
			e[i]=new Employee(empid,empName,dept,designation,basicSalary,experience);
			
		}
		
		
	}
}
