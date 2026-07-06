/*Question 13: Create a base class Consumer with attributes name and units.
Create a child class Bill that adds ratePerUnit.
Use super keyword to initialize parent class variables.
Store 2 consumers using an array of objects and calculate total bill.
Asked In Practice Assignment
Description
This assignment shows how inheritance can be used in utility billing systems.
super helps reuse parent class constructor.

Input
Enter number of Consumers: 2

Enter Name: Ramesh
Enter Units: 100
Enter Rate per Unit: 5

Enter Name: Sita
Enter Units: 150
Enter Rate per Unit: 6
Output
Name: Ramesh, Total Bill: 500
Name: Sita, Total Bill: 900*/
import java.util.*;
class Consumer
{
	String name;
	int units;
	
	Consumer(String name,int units)
	{
		this.name=name;
		this.units=units;
	}
}
class Bill extends Consumer
{
	int ratePerUnit;
	Bill(String name,int units,int ratePerUnit)
	{
		super(name,units);
		this.ratePerUnit=ratePerUnit;
	}
	void display()
	{
		System.out.println("Name :"+name+ ", Total bill :"+(units*ratePerUnit));
	}
}
class Q13Bill
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of consumers");
		int n=xyz.nextInt();
		Bill b[]=new Bill[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Name");
			String name=xyz.next();
			System.out.println("Enter Units");
			int units=xyz.nextInt();
			System.out.println("Enter ratePerUnit");
			int ratePerUnit=xyz.nextInt();
			b[i]=new Bill(name,units,ratePerUnit);
		}
		for(int i=0;i<n;i++)
		{
			b[i].display();
		}
	}
}