/*Question 47: Create an abstract class Book to manage book issue details.
Asked In Practice Question
Abstract class Book contains title and abstract method getDetails().
Subclasses:

EBook ? display file size

PrintedBook ? display number of pages

Input
Type: EBook
Title: Java Basics
File Size: 5MB
Output
Book: Java Basics
File Size: 5MB*/
import java.util.*;
abstract class Book{
	
	String title;
	abstract void getDetails();
}
class EBook extends Book{
	int size;
	EBook(String title,int size)
	{
	
		this.title=title;
		this.size=size;
	}
	public void getDetails()
	{
		System.out.println("Book :"+title);
		System.out.println("File Size :"+size+"MB");
	}
}
class PrintedBook extends Book
{
	int pages;
	PrintedBook(String title,int pages)
	{
		
		this.title=title;
		this.pages=pages;
	}
	public void getDetails()
	{
		System.out.println("Book :"+title);
		System.out.println("Pages :"+pages+" pages");
	}
}
class Q47Book
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.EBook");
		System.out.println("2.Printed Book");
		System.out.println("Enter Choice");
		int choice=xyz.nextInt();
		xyz.nextLine();
		
		Book b;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Book title");
		String title=xyz.nextLine();
			System.out.println("Enter file size");
			int size=xyz.nextInt();
			b=new EBook(title,size);
			b.getDetails();
			break;
			
			case 2:
			System.out.println("Enter Book title");
		 title=xyz.nextLine();
			System.out.println("Enter Pages");
			int pages=xyz.nextInt();
			b=new PrintedBook(title,pages);
			b.getDetails();
			break;
			
			default:
			System.out.println("Wrong choice");
		}
	}
}