/*Question 24: Create a base class Product with attributes name.
Create a child class Electronic that adds price.
Create another child class Mobile that adds brand.
Use constructor chaining (super()) to initialize all values.
Store 3 mobiles using an array of objects and display details.
Asked In Practice Assignment
Description
This program shows how multiple levels of inheritance pass
values through constructors using super().
Input
Enter number of Mobiles: 3

Enter Name: Smartphone
Enter Price: 20000
Enter Brand: Samsung

Enter Name: Smartphone
Enter Price: 15000
Enter Brand: Vivo

Enter Name: Smartphone
Enter Price: 30000
Enter Brand: OnePlus
Output
Name: Smartphone, Price: 20000, Brand: Samsung
Name: Smartphone, Price: 15000, Brand: Vivo
Name: Smartphone, Price: 30000, Brand: OnePlus*/
import java.util.*;
class Product
{
	String name;
	Product(String name)
	{
		this.name=name;
	}
}
class Electronic extends Product
{
	int price;
	Electronic(String name,int price)
	{
		super(name);
		this.price=price;
	}
}
class Mobile extends Electronic
{
	String brand;
	Mobile(String name,int price,String brand)
	{
		super(name,price);
		this.brand=brand;
	}
	void display()
	{
		System.out.println("Name :"+name+", Price :"+price+", Brand :"+brand);
	}
}
class Q24ElectronicProduct
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Mobiles");
		int n=xyz.nextInt();
		Mobile m[]=new Mobile[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Name");
			String name=xyz.next();
			System.out.println("Enter Price");
			int price=xyz.nextInt();
			System.out.println("Enter Brand");
			String brand=xyz.next();
			m[i]=new Mobile(name,price,brand);
		}
		for(int i=0;i<n;i++)
		{
			m[i].display();
		}
	}
}