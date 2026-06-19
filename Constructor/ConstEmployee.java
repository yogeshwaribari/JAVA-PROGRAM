/*Question 2: Write a Java program to create an Employee class and calculate yearly salary using 
constructor.

Description: Create Employee class with empId, empName and monthlySalary. Use constructor to initialize 
values. Calculate yearly salary (monthlySalary × 12) and display it.
INPUT:
Enter Employee Id: 201
Enter Employee Name: Amit
Enter Monthly Salary: 25000

OUTPUT:
Employee Name: Amit
Yearly Salary: 300000

EXPLANATION:
Create Employee class with fields empId, empName, monthlySalary. Use constructor public Employee
(int empId, String empName, int monthlySalary) to initialize. Calculate yearly salary as 
monthlySalary * 12 in constructor or display method. Display employee name and yearly salary.
*/
import java.util.*;
class Employee
{
	private int empId;
	private String empName;
	private int monthlySalary;
	
	Employee(int empId,String empName,int monthlySalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.monthlySalary=monthlySalary;
	}
	void display()
	{
		System.out.println("Employee Name : "+empName);
		monthlySalary=monthlySalary*12;
		System.out.println("Yearly Salary : "+monthlySalary);
	}
	
}
class ConstEmployee
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter emp Id");
		int empId=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Name");
		String empName=xyz.nextLine();
		System.out.println("Enter monthly Salary");
		int monthlySalary=xyz.nextInt();
		
		Employee e=new Employee(empId,empName,monthlySalary);
		e.display();
	}
}