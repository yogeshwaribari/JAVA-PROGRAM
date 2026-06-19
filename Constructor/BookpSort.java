/*Question 17: Write a Java program to sort Book objects based on price.

Description: Create Book class with id, name and price. Store 5 books using constructor.
 Sort based on price using simple sorting logic.
INPUT:
1 Java 500
2 Python 450
3 C++ 600
4 SQL 300
5 HTML 250

OUTPUT:
Books sorted by price:
HTML 250
SQL 300
Python 450
Java 500
C++ 600

EXPLANATION:
Create Book class with fields id, name, price. Store 5 books in array using constructor. 
Use bubble sort or selection sort to sort by price in ascending order. Compare book.price 
values and swap if needed. Display sorted books with name and price.*/
import java.util.*;
class Book{
	int id;
	String name;
	int price;
	
	Book(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display()
	{
		System.out.println(name+ " "+price);
	}
	
	
	
}
class BookpSort
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Book b[]=new Book[5];
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter Book Id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter Book Name");
			String name=xyz.nextLine();
			System.out.println("Enter Price");
			int price=xyz.nextInt();
			
			b[i]=new Book(id,name,price);
		}
		for(int i=0;i<b.length-1;i++)
		{
			for(int j=0;j<b.length-1-i;j++)
			{
				if(b[j].price>b[j+1].price)
				{
					Book temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
			
		}
		System.out.println("Books sorted by price:");
		for(int i=0;i<b.length;i++)
		{
			b[i].display();
		}
	}
}