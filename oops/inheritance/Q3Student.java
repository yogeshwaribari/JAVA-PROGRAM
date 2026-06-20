/*Question 3: Create a base class Student with attributes name and rollNo.
Create a child class Result that includes marks of 3 subjects.
Calculate total and percentage.
Asked In: Practice Assignment
Description
This assignment demonstrates inheritance with calculation logic.
The child class uses parent data and extends it to compute academic results.

Input
Enter Name: Amit
Enter Roll No: 101
Enter Marks1: 80
Enter Marks2: 70
Enter Marks3: 90

Output
Name: Amit
Roll No: 101
Total Marks: 240
Percentage: 80.0%*/
import java.util.*;
class Student
{
	String name;
	int rollNo;
}
class Result extends Student
{
	int m1,m2,m3;
	void setData(String name,int rollNo,int m1,int m2,int m3)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Roll No :"+rollNo);
		int total=m1+m2+m3;
		System.out.println("Total :"+total);
		double per=total/3;
		System.out.println("Percentage :"+per+"%");
	}
}
class Q3Student
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=xyz.next();
		System.out.println("Enter RollNo");
		int rollNo=xyz.nextInt();
		System.out.println("Enter Marks 1");
		int m1=xyz.nextInt();
		System.out.println("Enter Marks 2");
		int m2=xyz.nextInt();
		System.out.println("Enter Marks 3");
		int m3=xyz.nextInt();
		
		Result r=new Result();
		r.setData(name,rollNo,m1,m2,m3);
		r.display();
	}
}
