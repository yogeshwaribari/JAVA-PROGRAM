/*Question 48: Create abstract class Student to calculate grades.
Asked In Practice Question
Abstract method calculateGrade().
Subclasses:

SchoolStudent

CollegeStudent

Grade based on marks.

Input
Type: School
Marks: 85
Output
Grade: A*/
import java.util.*;
abstract class Student
{
	int marks;
	abstract void calculateGrade();
}
class SchoolStudent extends Student
{
	SchoolStudent(int marks)
	{
		this.marks=marks;
	}
	public void calculateGrade()
	{
		if(marks>=85)
		{
			System.out.println("Grade : A");
		}
		else if(marks>=65)
		{
			System.out.println("Grade : B");
		}
		else{
			System.out.println("Grade : C");
		}
	}
	
}
class CollegeStudent extends Student
{
	CollegeStudent(int marks)
	{
		this.marks=marks;
	}
	public void calculateGrade()
	{
		if(marks>=85)
		{
			System.out.println("Grade : A");
		}
		else if(marks>=65)
		{
			System.out.println("Grade : B");
		}
		else{
			System.out.println("Grade : C");
		}
	}
}
class Q48StudentMarks
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.School Student");
		System.out.println("2.College Student");
		System.out.println("Enter Choice");
		int choice=xyz.nextInt();
		Student s;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Marks");
			int marks=xyz.nextInt();
			s=new SchoolStudent(marks);
			s.calculateGrade();
			break;
			
			case 2:
			System.out.println("Enter Marks");
			 marks=xyz.nextInt();
			s=new CollegeStudent(marks);
			s.calculateGrade();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}