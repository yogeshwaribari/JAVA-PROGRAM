/*Question 25: Create a base class Student with attributes name.
Create a child class Exam that adds marks.
Create another child class Result that calculates grade.
Use constructor chaining (super()).
Store 3 students using an array of objects and display grade.

Grade Rule:
? 80 ? A
? 60 ? B
< 60 ? C

Description
This assignment demonstrates multilevel constructor chaining
with logic processing (grading system).
Input
Enter number of Students: 3

Enter Name: Amit
Enter Marks: 85

Enter Name: Pooja
Enter Marks: 70

Enter Name: Kiran
Enter Marks: 50
Output
Name: Amit, Grade: A
Name: Pooja, Grade: B
Name: Kiran, Grade: C*/
import java.util.*;
class Student
{
	String name;
	Student(String name)
	{
		this.name=name;
	}
}
class Exam extends Student
{
	int marks;
	Exam(String name,int marks)
	{
		super(name);
		this.marks=marks;
	}
}
class Result extends Exam
{
	Result(String name,int marks)
	{
		super(name,marks);
	}
	void display()
	{
	if(marks>=80)
	{
		System.out.println("Name :"+name+", Grade : A");
	}
	else if(marks>=60)
	{
		System.out.println("Name :"+name+", Grade : B");
	}
	else{
		System.out.println("Name :"+name+", Grade : C");
	}
	}
}
class Q25StudentMark
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Student");
		int n=xyz.nextInt();
		
		Result r[]=new Result[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Name");
			String name=xyz.next();
			System.out.println("Enter Marks");
			int marks=xyz.nextInt();
			r[i]=new Result(name,marks);
		}
		for(int i=0;i<n;i++)
		{
			r[i].display();
		}
	}
}