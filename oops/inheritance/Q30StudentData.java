/*Question 30: Create a class Student with attributes name and age.
Use this keyword to initialize variables using constructor.

Create a child class CollegeStudent that adds course.
Use this() constructor chaining and super() to initialize all values.

Store 2 students using array of objects and display details.
Asked In Practice Assignment
Description
Demonstrates use of this keyword for variable initialization and
constructor chaining (this() + super()).
Input
Enter number of Students: 2

Enter Name: Amit
Enter Age: 20
Enter Course: BCA

Enter Name: Neha
Enter Age: 21
Enter Course: BBA
Output
Name: Amit, Age: 20, Course: BCA
Name: Neha, Age: 21, Course: BBA*/
import java.util.*;
class Student
{
	String name;
	int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class CollegeStudent extends Student
{
	String course;
	CollegeStudent(String name,int age,String course)
	{
		super(name,age);
		this.course=course;
	}
	void display()
	{
		System.out.println("Name :"+name+", Age :"+age+", Course :"+course);
	}
}
class Q30StudentData
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of student");
		int n=xyz.nextInt();
		CollegeStudent c[]=new CollegeStudent[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Student Name");
			String name=xyz.next();
			System.out.println("Enter Age");
			int age=xyz.nextInt();
			System.out.println("Enter Course");
			String course=xyz.next();
			c[i]=new CollegeStudent(name,age,course);
		}
		for(int i=0;i<n;i++)
		{
			c[i].display();
		}
	
	}
}