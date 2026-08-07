/*6. Online Shopping Application
An e-commerce company wants to manage different product categories.
Requirements:
•	Create a superclass Product. 
•	Create subclasses Electronics, Clothing, and Books. 
•	Each product calculates discounts differently. 
•	All products support return and exchange policies. 
•	Product ID should remain constant. 
•	Use the parent constructor to initialize common product details. 
•	Customers should purchase products using a common Product reference. 
•	The company tax calculation method should not be overridden. 
•	Create a utility class containing helper methods and demonstrate method hiding by 
creating a child utility class with a static method having the same name. 
Implement using:
•	Inheritance 
•	Abstract Class 
•	Interface 
•	Method Overriding 
•	Dynamic Polymorphism 
•	super() Constructor 
•	final Keyword 
•	Loose Coupling 
•	Method Hiding (Static Methods) 
*/
import java.util.*;
interface returnPolicy
{
	void returnProduct();
	void exchangeProduct();
}
abstract class Product implements returnPolicy
{
	final int id;
	String name;
	int price;
	Product(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display()
	{
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
	}
	abstract void discounts();
	final void tax()
	{
		System.out.println("Company Tax = 18%");
	}
}
class Utility
{
	static void helper()
	{
		System.out.println("Parent Utility");
	}
}
class ChildUtility extends Utility
{
	static void helper()
	{
		System.out.println("Child Utility");
	}
}
class Electronics extends Product
{
	Electronics(int id,String name,int price)
	{
		super(id,name,price);
	}
	void discounts()
	{
		int dis=price*20/100;
		int tot=price-dis;
		System.out.println("Total Price :"+tot);
	}
	public void returnProduct()
	{
		System.out.println("Return policies Available");
	}
	public void exchangeProduct()
	{
		System.out.println("exchange policies Available");
	}
}
class Clothing extends Product{
	Clothing(int id,String name,int price)
	{
		super(id,name,price);
	}
	void discounts()
	{
		int dis=price*10/100;
		int tot=price-dis;
		System.out.println("Total Price :"+tot);
	}
	public void returnProduct()
	{
		System.out.println("Return policies Available");
	}
	public void exchangeProduct()
	{
		System.out.println("exchange policies Available");
	}
}
class Books extends Product{
	Books(int id,String name,int price)
	{
		super(id,name,price);
	}
	void discounts()
	{
		int dis=price*5/100;
		int tot=price-dis;
		System.out.println("Total Price :"+tot);
	}
	public void returnProduct()
	{
		System.out.println("Return policies Available");
	}
	public void exchangeProduct()
	{
		System.out.println("exchange policies Available");
	}
}
class OnlineShopping
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.Electronics");
		System.out.println("2.Clothing");
		System.out.println("3.Books");
		System.out.println("Enter Choice");
		int choice=xyz.nextInt();
		Product p;
		switch(choice)
		{
			case 1:
			System.out.println("Enter id");
			int id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter name");
			String name=xyz.nextLine();
			System.out.println("Enter price");
			int price=xyz.nextInt();
			p=new Electronics(id,name,price);
			p.display();
			p.discounts();
			p.returnProduct();
			p.exchangeProduct();
			p.tax();
			Utility.helper();
			ChildUtility.helper();
			break;
			
			case 2:
			System.out.println("Enter id");
			 id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter name");
			 name=xyz.nextLine();
			System.out.println("Enter price");
			 price=xyz.nextInt();
			p=new Clothing(id,name,price);
			p.display();
			p.discounts();
			p.returnProduct();
			p.exchangeProduct();
			p.tax();
			Utility.helper();
			ChildUtility.helper();
			break;
			
			case 3:
			System.out.println("Enter id");
			 id=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter name");
			 name=xyz.nextLine();
			System.out.println("Enter price");
			 price=xyz.nextInt();
			p=new Books(id,name,price);
			p.display();
			p.discounts();
			p.returnProduct();
			p.exchangeProduct();
			p.tax();
			Utility.helper();
			ChildUtility.helper();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}