/*Question 14: Create a base class Library with attributes bookName and daysLate.
Create a child class Fine that adds finePerDay.
Use super to initialize parent variables.
Store 2 records using an array of objects and calculate total fine.
Asked In Practice Assignment
Description
This assignment demonstrates how inheritance can be applied in a library management system
for fine calculation.

Input
Enter number of Records: 2

Enter Book Name: Java
Enter Days Late: 5
Enter Fine per Day: 10

Enter Book Name: Python
Enter Days Late: 3
Enter Fine per Day: 15
Output
Book: Java, Total Fine: 50
Book: Python, Total Fine: 45*/
import java.util.*;
class Library
{
	String bookName;
	int daysLate;
	
	void setData(String bookName,int daysLate)
	{
		this.bookName=bookName;
		this.daysLate=daysLate;
	}
}
class Fine extends Library
{
	int finePerDay;
	void storeData(String bookName,int daysLate,int finePerDay)
	{
		super.setData(bookName,daysLate);
		this.finePerDay=finePerDay;
	}
	void display()
	{
		System.out.println("Book :"+bookName+ ", Total Fine :"+(daysLate*finePerDay));
	}
}
class Q14Library
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of Records:");
		int n=xyz.nextInt();
		Fine f[]=new Fine[n];
		for(int i=0;i<n;i++)
		{
			f[i]=new Fine();
			System.out.println("Enter name");
			String bookName=xyz.next();
			System.out.println("Enter Days Late");
			int daysLate=xyz.nextInt();
			System.out.println("Enter Fine Per Day");
			int finePerDay=xyz.nextInt();
			f[i].storeData(bookName,daysLate,finePerDay);
		}
		for(int i=0;i<n;i++)
		{
			f[i].display();
		}
	}
}