/*Question 54: Create abstract class Order.
Asked In Practice Question
Abstract method processOrder().
Subclasses:

FoodOrder

GroceryOrder

Input
Order Type: Food
Amount: 500
Output
Food Order Processed
Amount: 500*/
import java.util.*;
abstract class Order
{
	int amt;
	Order(int amt)
	{
		this.amt=amt;
	}
	abstract void processOrder();
} 
class FoodOrder extends Order
{
	FoodOrder(int amt)
	{
		super(amt);
	}
	void processOrder()
	{
		System.out.println("Food Order Processed \nAmount :"+amt);
	}
}
class GroceryOrder extends Order
{
	GroceryOrder(int amt)
	{
		super(amt);
	}
	void processOrder()
	{
		System.out.println("Grocery Order Processed \nAmount :"+amt);
	}	
}
class Q54Order
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.Food Order");
		System.out.println("2.Grocery Order");
		System.out.println("Enter choice");
		int choice=xyz.nextInt();
		Order o;
		switch(choice)
		{
			case 1:
				System.out.println("Enter Amount");
				int amt=xyz.nextInt();
				o=new FoodOrder(amt);
				o.processOrder();
				break;
			
			case 2:
				System.out.println("Enter Amount");
				 amt=xyz.nextInt();
				o=new GroceryOrder(amt);
				o.processOrder();
				break;
			
			default :
				System.out.println("Wrong choice");
		}
	}
}