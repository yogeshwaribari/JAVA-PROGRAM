/*Question 5: Create a base class Person with method display().
Create a child class Employee that overrides display() to show additional details like designation.
Asked In: Practice Assignment
Description
This assignment demonstrates method overriding in inheritance.
The child class modifies the behavior of the parent method.

Input
Enter Name: Suresh
Enter Age: 30
Enter Designation: Manager
Output
Name: Suresh
Age: 30
Designation: Manager*/
import java.util.*;
class Person
{
	String name;
	int age;
	
	void setData(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
class Employee extends Person
{
	String designation;
	void setData(String designation)
	{
		this.designation=designation;
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Designation :"+designation);
	}
}
class Q5Person
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=xyz.next();
		System.out.println("Enter Age");
		int age=xyz.nextInt();
		System.out.println("Enter designation");
		String designation=xyz.next();
		
		Employee e=new Employee();
		e.setData(name,age);
		e.setData(designation);
		e.display();
	}
}