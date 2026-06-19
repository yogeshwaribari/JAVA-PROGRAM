/*In an Employee Management System, why would you create 
multiple constructors for the Employee class?*/
import java.util.*;
class Employee
{
	int empId;
	String name;
	
	
	Employee()
	{
		System.out.println("Default Constructor");
	}
	Employee(int empId)
	{
		this.empId=empId;
	}
	Employee(int empId,String name)
	{
		this.empId=empId;
		this.name=name;
	}
	void display()
	{
		System.out.println(empId+" "+name);
	}
}
class EmployeeData
{
	public static void main(String x[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee(101);
		Employee e3=new Employee(101,"sita");
		
		e2.display();
		e3.display();
	}
}