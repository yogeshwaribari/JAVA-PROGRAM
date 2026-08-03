/*Q15.Create Book class:
● bookId
● bookName
● price
Store books in Vector and calculate total price of all books.
Description
Logical operation:
total = total + price
Input
1 Java 500
2 SQL 350
3 Python 400
Output
Total Book Price = 1250*/

package Assignment;
import java.util.*;
class Book
{
	private int bookId;
	private String bookName;
	Book(int bookId,String bookName,int price)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
}
public class Q15BookTotal {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList <Book>al=new ArrayList<Book>();
		System.out.println("Enter number of bokks");
		int n=xyz.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter book Id");
			int bookId=xyz.nextInt();
			System.out.println("Enter book Name");
			String bookName=xyz.nextLine();
			xyz.nextLine();
			System.out.println("Enter book price");
			int price=xyz.nextInt();
			Book b=new Book(bookId,bookName,price);
			al.add(b);
		}
		int sum=0;
		for(Book b:al)
		{
			sum=sum+b.getPrice();
		}
		System.out.println("Total Book Price = "+sum);
		
		

	}

}
