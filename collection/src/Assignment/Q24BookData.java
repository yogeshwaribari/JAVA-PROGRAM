/*Q24.Problem Statement
Create a library management program using Vector and Book POJO class.
Description
Fields:
● int bookId
● String title
● String author
● double price
Operations
1. Add books
2. Display books
3. Find costliest book
4. Search by author
5. Count total books
Input
Enter books:
3
Enter details:
1 Java Herbert 650
2 SQL Korth 550
3 Python Mark 700
Search author:
Herbert
Output
Book List:
Java Herbert 650
SQL Korth 550
Python Mark 700
Costliest Book:
Python
Books by Herbert:
Java
Total books = 3
*/
package Assignment;
import java.util.*;
class BookData
{
	private int bookId;
	private String title;
	private String author;
	private double price;
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	BookData(int bookId,String title,String author,double price)
	{
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
}

public class Q24BookData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of Books");
		int n=xyz.nextInt();
		Vector<BookData>v=new Vector<>();
		do {
			System.out.println("1. Add books");
			System.out.println("2. Display books");
			System.out.println("3. Find costliest book");
			System.out.println("4. Search by author");
			System.out.println("5. Count total books");
			System.out.println("Enter your choice");
			int c=xyz.nextInt();
			
			switch(c)
			{
			case 1:
				System.out.println("Enter Book Id");
				 int bookId=xyz.nextInt();
				 xyz.nextLine();
				 System.out.println("Enter Book Title");
				 String title=xyz.nextLine();
				 System.out.println("Enter Book Author");
				 String author=xyz.nextLine();
				 System.out.println("Enter price");
				 double price=xyz.nextDouble();
				 BookData b=new BookData(bookId,title,author,price);
				 v.add(b);
				 System.out.println("Book Added");
				break;
				
			case 2:
				for(BookData b1:v)
				{
					System.out.println(b1.getBookId()+"\t"+b1.getTitle()+"\t"+b1.getAuthor()+"\t"+b1.getPrice());
				}
				break;
				
			case 3:
				double max=0;
				String bookname="";
				System.out.println("Costliest Book:");
				for(BookData b3:v)
				{
					if(b3.getPrice()>max)
					{
						max=b3.getPrice();
						bookname=b3.getTitle();
					}
					
				}
				System.out.println(bookname+ "\t"+max);
				break;
				
			case 4:
				xyz.nextLine();
				System.out.println("Enter Search by Author");
				String sname=xyz.nextLine();
				boolean flag=false;
				for(BookData b2:v)
				{
					if(b2.getAuthor().equals(sname))
					{
						System.out.println("Book Found");
						System.out.println(b2.getBookId()+"\t"+b2.getTitle()+"\t"+b2.getAuthor()+"\t"+b2.getPrice());
						flag=true;
						break;
					}
				}
				if(!flag)
				{
					System.out.println("Book Not Found");
				}
				break;
				
			case 5:
				
					System.out.println("Total books ="+v.size());
				
				break;
				
				default:
					System.out.println("Wrong choice");
			}
			
		}while(true);
	}

}
