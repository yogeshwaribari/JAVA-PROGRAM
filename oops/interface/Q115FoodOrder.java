/*Question 115: Write a Java program to implement food ordering system using interface
Asked In Practice Assignment
Create interface FoodOrder with method placeOrder().
Implement in Pizza and Burger.
Display order details and total cost.

Input:
Enter choice (1-Pizza, 2-Burger): 1
Enter quantity: 2

Output:
Pizza ordered
Total Cost : 400*/
import java.util.*;
interface FoodOrder
{
	void placeOrder();
}
class Pizza implements FoodOrder
{
	int quantity;
	Pizza(int quantity)
	{
		this.quantity=quantity;
	}
	public void placeOrder()
	{
		int amt=200;
		System.out.println("Pizza Ordered");
		System.out.println("Total Cost :"+(amt*quantity));
	}
}
class Burger implements FoodOrder
{
	int quantity;
	Burger(int quantity)
	{
		this.quantity=quantity;
	}
	public void placeOrder()
	{
		int amt=100;
		System.out.println("Burger Ordered");
		System.out.println("Total Cost :"+(amt*quantity));
	}
}
class Q115FoodOrder
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your choice 1.pizza 2.Burger");
		int choice=xyz.nextInt();
		FoodOrder f;
		System.out.println("Enter quantity");
		int quantity=xyz.nextInt();
		
		switch(choice)
		{
			case 1:
			f=new Pizza(quantity);
			f.placeOrder();
			break;
			
			case 2:
			f=new Burger(quantity);
			f.placeOrder();
			break;
			
			default:
			System.out.println("Wrong choice");	
		}
	}
}