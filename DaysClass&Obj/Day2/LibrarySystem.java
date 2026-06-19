/*Scenario 1: Library Management System
Business Requirement
A college library wants to maintain information about all books available in the library. 
The librarian should be able to:
 Add new books.
 Search books.
 Issue books to students.
 Count the total number of books.
----------------------------------------------------------
Why Do We Need a Class?
Every book has common properties:
 Book ID
 Title
 Author
 Price
 Status (Issued/Available)
Instead of creating separate variables for every book, we create a Book class.
--------------------------------------------------------------
Objects : Each real book becomes an object.
Examples:
 Book Object 1 → Java Programming
 Book Object 2 → Python Programming
 Book Object 3 → Database Management System
----------------------------------------------------------------------
Instance Variables
Each book has its own:
bookId
title
author
price
status
These values are different for every object.
------------------------------------------------------------------------
Static Variables
libraryName
totalBooks
These values are common for all books.
------------------------------------------------
Array of Objects
The library stores multiple books.
Book[] books = new Book[1000];
-----------------------------------------------------
Example Data
Book Id  Title  Author          Price
101      Java   James Gosling    500
102     Python   Guido           450
103      DBMS     Guido           600
------------------------------------------------
Test Cases
Test Case 1
Input: Add 3 books.
Expected Output:
totalBooks = 3 
--------------------------------------
Test Case 2
Input: Issue Book 101.
Expected Output:
Book Status = Issued
--------------------------------------------
Test Case 3
Input: Change library name.
Expected Output:
All books show new library name.*/
import java.util.*;
class Library
{
	int bookId;
	String	title;
	String author;
	int price;
	String status;
	
	static String libraryName="Collage library";
	static int totalBooks=0;
	
	Library(int bookId,String title,String author,int price)
	{
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
		this.status="Available";
		totalBooks++;
	}
	
	
	void display()
	{
		System.out.println("Book Id :"+bookId);
		System.out.println("Title: "+title);
		System.out.println("Author :"+author);
		System.out.println("Price: "+price);
		System.out.println("Status:"+status);
		//System.out.println("Library Name"+libraryName);
	}
	
}
class LibrarySystem
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		
		Library b[]=new Library[15];
		int cnt=0;
		int choice;
		do{
			System.out.println("1.Add Book");
			System.out.println("2.Issue Book");
			System.out.println("3.Changing name");
			System.out.println("4.Display Data");
			System.out.println("5.Exit");
			System.out.println("Enter your Choice");
			choice=xyz.nextInt();
			
			switch(choice)
			{
				case 1:
				System.out.println("Enter Book id");
				int bookId=xyz.nextInt();
				xyz.nextLine();
				System.out.println("Enter Title");
				String title=xyz.nextLine();
				System.out.println("Enter Author Name");
				String author=xyz.nextLine();
				System.out.println("Enter Price");
				int price=xyz.nextInt();
				b[cnt]=new Library(bookId,title,author,price);
				cnt++;
				System.out.println("Book Added");
				break;
				
				case 2:
				System.out.println("Enter Book Id to Issued");
				int sid=xyz.nextInt();
				for(int i=0;i<cnt;i++)
				{
					if(sid==b[i].bookId)
					{
						b[i].status="Issued";
						System.out.println("Book Issued");
					}
				}
				break;
				
				case 3:
				xyz.nextLine();
				System.out.println("Enter New Library Name");
				String newname=xyz.nextLine();
				
				Library.libraryName=newname;
				System.out.println("Library name change");
				break;
				
				case 4:
					if (cnt == 0) {
						System.out.println("No Books Available");
					}
					else
					{
						for (int i = 0; i < cnt; i++) 
						{
							b[i].display();
						}
					}
					break;
				
				case 5:
				System.out.println("Program End");
				break;
				
				default:
				System.out.println("Invalid choice");
			}

		}while(true);
		
	}
}