/*Question 22: Create a base class FoodItem with attributes name and price.
Create a child class OrderItem that adds quantity.
Use constructor chaining (super()) to initialize parent variables.
Store 3 orders using an array of objects and calculate total cost.
Asked In Practice Assignment
Description
This assignment shows how constructor chaining works while performing
business logic (total cost calculation).
Input
Enter number of Orders: 3

Enter Item Name: Pizza
Enter Price: 250
Enter Quantity: 2

Enter Item Name: Burger
Enter Price: 100
Enter Quantity: 3

Enter Item Name: Pasta
Enter Price: 150
Enter Quantity: 1

Output
Item: Pizza, Total Cost: 500
Item: Burger, Total Cost: 300
Item: Pasta, Total Cost: 150*/
import java.util.*;
class FoodItem
{
	String name;
	int price;
	
	FoodItem(String name,int price)
	{
		this.name=name;
		this.price=price;
		
	}
}
class OrderItem extends FoodItem
{
	int quantity;
	OrderItem(String name,int price,int quantity)
	{
		super(name,price);
		this.quantity=quantity;
	}
	void display()
	{
		int total=price*quantity;
		System.out.println("Item :"+name+ ", Total Cost :"+total);
	}
}
class Q22FoodItem
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Order");
		int n=xyz.nextInt();
		OrderItem o[]=new OrderItem[n];
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Enter Item Name");
			String name=xyz.next();
			System.out.println("Enter Price");
			int price=xyz.nextInt();
			System.out.println("Enter Quantity");
			int quantity=xyz.nextInt();
			o[i]= new OrderItem(name,price,quantity);
		}
		for(int i=0;i<n;i++)
		{
			o[i].display();
		}
	}
}