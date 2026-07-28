/*Question 33: Create a base class Course with attributes courseName and fee.
Use this keyword for initialization.

Create a child class Module that adds duration.
Create another child class AdvancedModule that adds extraFee.

Use this() + super() constructor chaining.
Store 2 modules using array and calculate final fee.
Asked In Practice Assignment
Description
Shows how this and super work together in multilevel constructor chaining.
Input
Enter number of Modules: 2

Enter Course Name: Java
Enter Fee: 10000
Enter Duration: 3
Enter Extra Fee: 2000

Enter Course Name: Python
Enter Fee: 8000
Enter Duration: 2
Enter Extra Fee: 1500

Output
Course: Java, Final Fee: 12000
Course: Python, Final Fee: 9500*/
import java.util.*;
class Course
{
	String courseName;
	int fee;
	Course()
	{
		this("unkonow",0);
	}
	Course(String courseName,int fee)
	{
		this.courseName=courseName;
		this.fee=fee;
	}
}
class Module extends Course
{
	int duration;
	Module()
	{
		this("unkonow",0,0);
	}
	Module(String courseName,int fee,int duration)
	{
		super(courseName,fee);
		this.duration=duration;
	}
}
class AdvancedModule extends Module
{
	int extraFee;
	AdvancedModule()
	{
		this("unkonow",0,0,0);
	}
	AdvancedModule(String courseName,int fee,int duration,int extraFee)
	{
		super(courseName,fee,duration);
		this.extraFee=extraFee;
	}
	void display()
	{
		System.out.println("Course Name :"+courseName+", Final Fees :"+(fee+extraFee));
	}
}
class Q33Course
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Modules");
		int n=xyz.nextInt();
		AdvancedModule a[]=new AdvancedModule[n];
		for(int i=0;i<n;i++)
		{
			xyz.nextLine();
			System.out.println("Enter Course Name");
			String courseName=xyz.nextLine();
			System.out.println("Enter Fee");
			int fee=xyz.nextInt();
			System.out.println("Enter Duration");
			int duration=xyz.nextInt();
			System.out.println("Enter Extra fee");
			int extraFee=xyz.nextInt();
			a[i]=new AdvancedModule(courseName,fee,duration,extraFee);
		}
		for(int i=0;i<n;i++)
		{
			a[i].display();
		}
	}
}