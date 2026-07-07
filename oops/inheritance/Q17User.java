/*Question 17: Design an electricity billing system with slab rates.
Create a base class User with attributes name and units.
Create a child class Tariff that adds slab calculation logic:

First 100 units ? ?5/unit
Above 100 units ? ?8/unit

Use super keyword to initialize parent data.
Store 3 users using an array of objects and calculate total bill.
Asked In Practice Assignment
Description
This case study demonstrates real-world slab-based billing
logic using inheritance and arrays..
Input
Enter number of Users: 3

Enter Name: Ramesh
Enter Units: 80

Enter Name: Sita
Enter Units: 120

Enter Name: Mohan
Enter Units: 150
Output
Name: Ramesh, Bill: 400
Name: Sita, Bill: 660
Name: Mohan, Bill: 900*/
import java.util.*;
class User
{
	String name;
	int unit;
	void setData(String name,int unit)
	{
		this.name=name;
		this.unit=unit;
	}
}
class Tariff extends User
{
	void data(String name,int unit)
	{
		super.setData(name,unit);
	}
	void display()
	{
	int bill=0;
	if(unit<=100)
	{
		bill=unit*5;
	}
	else
	{
		bill=(100*5)+((unit-100)*8);
	}
	System.out.println("Name :"+name+", Bill :"+bill);
	}
}
class Q17User
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of User");
		int n= xyz.nextInt();
		Tariff t[]=new Tariff[n];
		for(int i=0;i<n;i++)
		{
			t[i]=new Tariff();
			System.out.println("Enter Name");
			String name=xyz.next();
			System.out.println("Enter Units");
			int unit=xyz.nextInt();
			t[i].data(name,unit);
		}
		for(int i=0;i<n;i++)
		{
			t[i].display();
		}
	}
}