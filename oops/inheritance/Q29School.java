/*Question 29: Create a base class School with attribute schoolName.
Create a child class Student that adds marks.
Create another child class SportsStudent that adds sportsScore.

Use constructor chaining (super()).
Store 3 students using array and calculate overall performance (marks + sportsScore).
Asked In Practice Assignment
Description
This assignment shows combining multiple performance metrics using multilevel chaining.
Input
Enter number of Students: 3

Enter School: ABC School
Enter Marks: 80
Enter Sports Score: 20

Enter School: ABC School
Enter Marks: 70
Enter Sports Score: 25

Enter School: ABC School
Enter Marks: 60
Enter Sports Score: 30
Output
School: ABC School, Total Score: 100
School: ABC School, Total Score: 95
School: ABC School, Total Score: 90*/
import java.util.*;
class School
{
	String schoolName;
	School(String schoolName)
	{
		this.schoolName=schoolName;
	}
}
class Student extends School
{
	int marks;
	Student(String schoolName,int marks)
	{
		super(schoolName);
		this.marks=marks;
	}
}
class SportsStudent extends Student
{
	int sportsScore;
	SportsStudent(String schoolName,int marks,int sportsScore)
	{
		super(schoolName,marks);
		this.sportsScore=sportsScore;
	}
	void display()
	{
		System.out.println("School Name :"+schoolName+", Total Marks :"+(marks+sportsScore));
	}
}
class Q29School
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Student");
		int n=xyz.nextInt();
		SportsStudent s[]=new SportsStudent[n];
		
		for(int i=0;i<n;i++)
		{
			xyz.nextLine();
			System.out.println("Enter School Name");
			String schoolName=xyz.nextLine();
			System.out.println("Enter Marks");
			int marks=xyz.nextInt();
			System.out.println("Enter sports Score");
			int sportsScore=xyz.nextInt();
			s[i]=new SportsStudent(schoolName,marks,sportsScore);
		}
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	
	}
}