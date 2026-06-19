/*Question 1: Write a Java program to create a Student POJO class with fields rollNo, name and marks.
 Use a parameterized constructor to initialize values and display student details.

Description: Create a Student class having private data members rollNo, name and marks. Initialize 
values using a constructor and display details using an object. Demonstrate object initialization using 
constructor.
INPUT:
Enter Roll No: 101
Enter Name: Rahul
Enter Marks: 78

OUTPUT:
Student Details:
Roll No: 101
Name: Rahul
Marks: 78
EXPLANATION:
Create Student class with private fields. Use parameterized constructor public Student
(int rollNo, String name, int marks) to initialize values. Create display method to show details. 
Create object with new Student(101, "Rahul", 78) and call display().

Asked In Companies:
Practice Assignment*/
import java.util.*;
class Student
{
	private int rollNo;
	private String name;
	private int marks;
	
	Student(int rollNo,String name,int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	void display()
	{
		
		System.out.println("Student Details :");
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name :"+name);
		System.out.println("Marks : "+marks);
	}
 
}
class ConstStudent
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Roll No");
		int rollNo=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Name");
		String name=xyz.nextLine();
		System.out.println("Enter Marks");
		int marks=xyz.nextInt();
		
		Student s=new Student(rollNo,name,marks);
		
		s.display();
	}
}