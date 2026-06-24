/*Question 6: Create a base class Book with attributes title and price.
Create a child class EBook that adds fileSize.
Store details of 3 EBooks using an array of objects and display all details.
Asked In: Practice Assignment
Description
This program demonstrates inheritance with an array of objects.
The child class EBook extends Book, and multiple objects are stored in an array.

Input
Enter number of EBooks: 3

Enter Title: Java Basics
Enter Price: 300
Enter File Size: 5

Enter Title: Python Guide
Enter Price: 400
Enter File Size: 8

Enter Title: C Programming
Enter Price: 250
Enter File Size: 6
Output
Title: Java Basics, Price: 300, File Size: 5MB
Title: Python Guide, Price: 400, File Size: 8MB
Title: C Programming, Price: 250, File Size: 6MB*/
import java.util.*;
class Book 
{
	String title;
	int price;
void setData(String title,int price)
{
	this.title=title;
	this.price=price;
}	
}
class EBook extends Book
{
	int fileSize;
	void setData(String title,int price,int fileSize)
	{
		super.setData(title,price);
		this.fileSize=fileSize;
	}
	void display()
	{
		System.out.println("Title :"+title);
		System.out.println("Price :"+price);
		System.out.println("File Size :"+fileSize+ "MB");
	}
}
class Q6Book
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		EBook b[]=new EBook[3];
		for(int i=0;i<b.length;i++)
		{
			b[i]=new EBook();
			System.out.println("Enter Title");
			String title=xyz.next();
			System.out.println("Enter price");
			int price=xyz.nextInt();
			System.out.println("Enter FileSize");
			int fileSize=xyz.nextInt();
			b[i].setData(title,price,fileSize);
			
		}
		for(int i=0;i<b.length;i++)
		{
			b[i].display();
		}
	}
}