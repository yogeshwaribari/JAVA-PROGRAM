/*Question 3: Write a Java program to demonstrate constructor overloading using a Book class.

Description: Create Book class with bookId, bookName and price. Create one default constructor and one 
parameterized constructor. Display values initialized by both constructors.
INPUT:
(Default constructor gives default values)
Enter Book Id: 11
Enter Book Name: Java Basics
Enter Price: 450

OUTPUT:
Book from Default Constructor:
Book Id: 0
Book Name: Unknown
Price: 0

Book from Parameterized Constructor:
Book Id: 11
Book Name: Java Basics
Price: 450

EXPLANATION:
Create two constructors: public Book() { bookId=0; bookName="Unknown"; price=0; } and 
public Book(int id, String name, int p) { bookId=id; bookName=name; price=p; }. 
Demonstrate both by creating two objects.
*/
import java.util.*;
class Book
{
	private int bookId;
	private String bookName;
	private int price;
	
	Book()
	{
		bookId=0;
		bookName="Unknown";
		price=0;
	}
	Book(int bookId,String bookName,int price)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}
	void display()
	{
		System.out.println("Book Id :"+bookId);
		System.out.println("Book Name :"+bookName);
		System.out.println("Price : "+price);
	}
}
class ConstBook
{
	public static void main(String x[])
	{
		Book b1=new Book();
		System.out.println("Book from Default Constructor:");
		b1.display();
		Scanner xyz =new Scanner(System.in);
		
		System.out.println("Enter Book Id");
		int bookId=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Name");
		String bookName=xyz.nextLine();
		System.out.println("Enter price");
		int price=xyz.nextInt();
		Book b2=new Book(bookId,bookName,price);
		System.out.println("Book from Parameterized Constructor:");
		b2.display();
	}
}