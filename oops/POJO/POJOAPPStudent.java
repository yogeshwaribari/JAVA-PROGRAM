/*Question 26: Write a Java program to implement a Student Result Analyzer using POJO class.
Create a POJO class Student with variables rollNo, marks1, marks2, and marks3.
Accept values using getter and setter methods and calculate:
- Total marks
- Average marks
- Result (Pass if average >= 40, otherwise Fail)
Input:
Enter Roll No : 101
Enter Marks1 : 60
Enter Marks2 : 50
Enter Marks3 : 45

Output:
Roll No : 101
Total Marks : 155
Average : 51.66
Result : Pass

Explanation:
A POJO (Plain Old Java Object) class Student has private fields: rollNo, marks1, marks2, marks3.
Public setter methods (setRollNo, setMarks1, setMarks2, setMarks3) assign values.
Public getter methods (getRollNo, getMarks1, etc.) retrieve values.
Total = marks1 + marks2 + marks3 = 60 + 50 + 45 = 155.
Average = Total / 3.0 = 155 / 3.0 = 51.66.
Since 51.66 >= 40, Result = Pass.
POJO classes promote data encapsulation by keeping fields private.*/
import java.util.*;
class Student{
	private int rollNo;
	private int m1;
	private int m2;
	private int m3;
	
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public void setM1(int m1)
	{
		this.m1=m1;
	}
	public int getM1()
	{
		return m1;
	}
	public void setM2(int m2)
	{
		this.m2=m2;
	}
	public int getM2()
	{
		return m2;
	}
	public void setM3(int m3)
	{
		this.m3=m3;
	}
	public int getM3()
	{
		return m3;
	}
}

class POJOAPPStudent
{
	public static void main(String x[])
	{
	Scanner xyz=new Scanner(System.in);
	Student s=new Student();
	System.out.println("Enter Roll No");
	s.setRollNo(xyz.nextInt());
	System.out.println("Enter Marks1");
	s.setM1(xyz.nextInt());
	System.out.println("Enter Marks2");
	s.setM2(xyz.nextInt());
	System.out.println("Enter Marks3");
	s.setM3(xyz.nextInt());
	System.out.println("Roll No = "+s.getRollNo());
	
	int total=s.getM1()+s.getM2()+s.getM3();
	double avg=total/3.0;
	System.out.println("Total = "+total);
	System.out.println("Average = "+avg);
	
	if(avg>=40)
	{
		System.out.println("Result = Pass");
	}
	else
	{
		System.out.println("Result = Fail");
	}
}
}
	
