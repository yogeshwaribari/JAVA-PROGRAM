/*Question 21: Write a Java program to count passing students.

Description: Create Student class with name and marks. Store students. Count students having marks ? 40.
INPUT:
Amit 35
Raj 67
Neha 90
Pooja 25

OUTPUT:
Passing Students: 2

EXPLANATION:
Create Student class with fields name and marks. Use constructor to initialize. Store 4 students in array. 
Loop through array, check if marks >= 40. If true, increment counter. Display passing student count. 
Raj (67 >= 40) and Neha (90 >= 40) are passing.*/
import java.util.*;
class Student
{
	String name;
	int marks;
	
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	void display(int cnt)
	{
		System.out.println("Passing Students :"+cnt);
	}
}
class PassingStu
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Student s[]=new Student[4];
		for(int i=0;i<s.length;i++)
		{
			
			System.out.println("Enter Name");
			String name=xyz.next();
			//xyz.nextLine();
			System.out.println("Enter Marks");
			int marks=xyz.nextInt();
			
			s[i]=new Student(name,marks);
		}
		int cnt=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].marks>40)
			{
				cnt++;
			}
		}
		s[0].display(cnt);
	}
}