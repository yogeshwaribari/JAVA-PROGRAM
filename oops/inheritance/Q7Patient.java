/*Question 7: Create a base class Patient with attributes name and age.
Create a child class InPatient that adds roomNumber.
Store details of 2 patients using an array of objects and display them.
Asked In Practice Assignment
Description
This assignment uses inheritance to extend patient details and stores multiple records
using an array of objects.

Input
Enter number of Patients: 2

Enter Name: Ravi
Enter Age: 45
Enter Room Number: 101

Enter Name: Meena
Enter Age: 30
Enter Room Number: 102
Output
Name: Ravi, Age: 45, Room No: 101
Name: Meena, Age: 30, Room No: 102*/
import java.util.*;
class Patient
{
	String name;
	int age;
}
class InPatient extends Patient
{
	int roomNumber;
	void setData(String name,int age,int roomNumber)
	{
		this.name=name;
		this.age=age;
		this.roomNumber=roomNumber;
	}
	void display()
	{
		System.out.println("Name:"+name+ ", Age:"+age+ ", Room No:"+roomNumber);
		
	}
}
class Q7Patient
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of Patients:");
		int n=xyz.nextInt();
		InPatient p[]=new InPatient[n];
		for(int i=0;i<n;i++)
		{
			p[i]=new InPatient();
			System.out.println("Enter Name");
			String name=xyz.next();
			//xyz.nextLine();
			System.out.println("Enter Age");
			int age=xyz.nextInt();
			System.out.println("Room No");
			int roomNumber=xyz.nextInt();
			p[i].setData(name,age,roomNumber);
		}
		System.out.println("patients Detail");
		for(int i=0;i<n;i++)
		{
			p[i].display();
		}
	}
}