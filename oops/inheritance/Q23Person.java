/*Question 23: Create a base class Person with attributes name.
Create a child class Employee that adds salary.
Create another child class Manager that adds bonus.
Use multilevel constructor chaining (super()) to initialize all properties.
Store 2 managers using an array of objects and calculate total salary.
Asked In Practice Assignment
Description
This assignment demonstrates multilevel inheritance (Person ? Employee ? Manager).
Constructor chaining ensures that all parent class constructors are executed in order.
Input
Enter number of Managers: 2

Enter Name: Rahul
Enter Salary: 50000
Enter Bonus: 10000

Enter Name: Neha
Enter Salary: 60000
Enter Bonus: 15000
Output
Name: Rahul, Total Salary: 60000
Name: Neha, Total Salary: 75000*/
import java.util.*;
class Person 
{
	String name;
	Person(String name)
	{
		this.name=name;
	}
}
class Employee extends Person
{
	int salary;
	Employee(String name,int salary)
	{
		super(name);
		this.salary=salary;
	}
}
class Manager extends Employee
{
	int bonus;
	Manager(String name,int salary,int bonus)
	{
		super(name,salary);
		this.bonus=bonus;
	}
	void display()
	{
		int total=salary+bonus;
		System.out.println("Name :"+name+ ", Total Salary :"+total);
	}
}
class Q23Person
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Managers");
		int n=xyz.nextInt();
		Manager m[]=new Manager[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Name");
			String name=xyz.next();
			System.out.println("Enter Salary");
			int salary=xyz.nextInt();
			System.out.println("Enter Bonus");
			int bonus=xyz.nextInt();
			m[i]=new Manager(name,salary,bonus);
		}
		for(int i=0;i<n;i++)
		{
			m[i].display();
		}
	}
}