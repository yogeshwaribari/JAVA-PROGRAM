/*Q.5 Write a Java program to demonstrate object creation by creating an `Employee` class and 
creating two Employee objects. */
import java.util.*;
class Employee
{
	void display(int id)
	{
		System.out.println("ID "+id);
	}
	void display(int id,String name)
	{
		System.out.println("ID "+id+" Name :"+name);
	}
	
}
class Q5EmployeeTwoObj
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Id");
		int id=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Name");
		String name=xyz.nextLine();
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.display(id);
		e2.display(id,name);
	}
}