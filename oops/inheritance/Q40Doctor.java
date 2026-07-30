/*Question 40: Create a base class Person with attribute name.
Create a child class Doctor that adds consultationFee.
Create another child class SpecialistDoctor that adds specialFee.

Use this and super().
Store 2 doctors using array and calculate total fee.
Asked In Practice Assignment
Description
Models a hospital billing system.
Input
Enter number of Doctors: 2

Enter Name: Dr. Sharma
Enter Fee: 500
Enter Special Fee: 300

Enter Name: Dr. Mehta
Enter Fee: 600
Enter Special Fee: 400
Output
Doctor: Dr. Sharma, Total Fee: 800
Doctor: Dr. Mehta, Total Fee: 1000*/
import java.util.*;
class Person
{
	String name;
	Person(String name)
	{
		this.name=name;
	}
}
class Doctor extends Person
{
	int consultationFee;
	Doctor(String name,int consultationFee)
	{
		super(name);
		this.consultationFee=consultationFee;
	}
}
class SpecialistDoctor extends Doctor
{
	int specialFee;
	SpecialistDoctor(String name,int consultationFee,int specialFee)
	{
		super(name,consultationFee);
		this.specialFee=specialFee;
	}
	void display()
	{
		int total=consultationFee+specialFee;
		System.out.println("Doctor :"+name+", total fees :"+total);
	}
}
class Q40Doctor
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of doctors");
		int n=xyz.nextInt();
		SpecialistDoctor s[]=new SpecialistDoctor[n];
		for(int i=0;i<n;i++)
		{
			xyz.nextLine();
			System.out.println("Enter Doctor name");
			String name=xyz.nextLine();
			System.out.println("Enter consultation Fee");
			int consultationFee=xyz.nextInt();
			System.out.println("Enter special Fee");
			int specialFee=xyz.nextInt();
			s[i]=new SpecialistDoctor(name,consultationFee,specialFee);
		}
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	}
}