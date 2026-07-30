/*Question 53: Create abstract class Exam.
Asked In Practice Question
Abstract method getResult().
Subclasses:

TheoryExam

PracticalExam

Input
Marks: 40
Output
Result: Pass*/
import java.util.*;
abstract class Exam
{
	int marks;
	Exam(int marks)
	{
		this.marks=marks;
	}
	abstract void getResult();
}
class TheoryExam extends Exam
{
	TheoryExam(int marks)
	{
		super(marks);
	}
	void getResult()
	{
		if(marks>=35)
		{
			System.out.println("Result :Pass");
		}
		else
		{
			System.out.println("Result :Fail");
		}
	}
}
class PracticalExam extends Exam
{
	PracticalExam(int marks)
	{
		super(marks);
	}
	void getResult()
	{
		if(marks>=40)
		{
			System.out.println("Result :Pass");
		}
		else
		{
			System.out.println("Result :Fail");
		}
	}
}
class Q53Exam
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.Theory Exam");
		System.out.println("2.Practical Exam");
		System.out.println("Enter choice");
		int choice=xyz.nextInt();
		Exam e;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Marks");
			int marks=xyz.nextInt();
			e=new TheoryExam(marks);
			e.getResult();
			break;
			
			case 2:
			System.out.println("Enter Marks");
			 marks=xyz.nextInt();
			 e=new PracticalExam(marks);
			 e.getResult();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}