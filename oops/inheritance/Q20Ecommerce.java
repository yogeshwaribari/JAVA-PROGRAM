/*Question 20: Design an e-commerce cart system.
Create a base class Product with attributes name and price.
Create a child class Cart that adds quantity and discount.
Use super keyword to initialize parent properties.
Store 3 products using an array of objects and calculate final payable amount.
Asked In Practice Assignment
Description
This project simulates a shopping cart system with discount and quantity
calculations using inheritance.
Input
Enter number of Products: 3

Enter Name: Laptop
Enter Price: 50000
Enter Quantity: 1
Enter Discount: 5000

Enter Name: Mobile
Enter Price: 20000
Enter Quantity: 2
Enter Discount: 2000

Enter Name: Mouse
Enter Price: 500
Enter Quantity: 2
Enter Discount: 100
Output
Product: Laptop, Final Amount: 45000
Product: Mobile, Final Amount: 38000
Product: Mouse, Final Amount: 900*/
import java.util.*;
class Product{
	String name;
	int price;
	
	void setData(String name,int price)
	{
		this.name=name;
		this.price=price;
	}
}
class Cart extends Product
{
	int quantity,discount;
	void Data(String name,int price,int quantity,int discount)
	{
		super.setData(name,price);
		this.quantity=quantity;
		this.discount=discount;
	}
	void display()
	{
		int total=price*quantity;
		int finalamt=total-discount;
		System.out.println("Product :"+name+ ", Final Amount :"+finalamt);
	}
}
class Q20Ecommerce
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of products");
		int n=xyz.nextInt();
		Cart c[]=new Cart[n];
		for(int i=0;i<n;i++)
		{
			c[i]=new Cart();
			System.out.println("Enter Product Name");
			String name=xyz.next();
			System.out.println("Enter Price");
			int price=xyz.nextInt();
			System.out.println("Enter Quantity");
			int quantity=xyz.nextInt();
			System.out.println("Enter Discount");
			int discount=xyz.nextInt();
			c[i].Data(name,price,quantity,discount);
		}
		for(int i=0;i<n;i++)
		{
			c[i].display();
		}
	}
}