/*Question 1: Create a base class Employee with attributes name and salary.
Create a child class Manager that adds bonus.
Calculate total salary using inheritance.
Asked In: Practice Assignment
Description
This program demonstrates single inheritance where Manager inherits from Employee.
The child class extends functionality by adding a bonus and calculating total salary.

Input
Enter Name: Rahul
Enter Salary: 50000
Enter Bonus: 10000

Output
Employee Name: Rahul
Base Salary: 50000
Bonus: 10000
Total Salary: 60000*/
import java.util.*;
class Employee
{
	String name;
	int salary;
	int bonus;
	
	void setEmplyee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
		
	}
}
class Manager extends Employee
{
	int bonus;
	void setBonus(int bonus)
	{
		this.bonus=bonus;
	}
	void show()
	{
		System.out.println("Employee Name :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("Bonus :"+bonus);
		int total=salary+bonus;
		System.out.println("Total :"+total);
	}
}
class EmployeeData
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter name");
		String name=xyz.next();
		
		System.out.println("Enter Salary");
		int salary=xyz.nextInt();
		
		System.out.println("Enter Bonus");
		int bonus=xyz.nextInt();
		
		Manager m=new Manager();
		m.setEmplyee(name,salary);
		m.setBonus(bonus);
		m.show();
	}
}