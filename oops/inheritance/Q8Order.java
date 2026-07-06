/*Question 8: Create a base class Order with attributes orderId and amount.
Create a child class OnlineOrder that adds deliveryCharge.
Store 3 orders using an array of objects and calculate total payable amount.
Asked In Practice Assignment
Description
This program shows how child class extends parent functionality and processes
multiple objects using arrays.

Input
Enter number of Orders: 3

Enter Order ID: 1
Enter Amount: 500
Enter Delivery Charge: 50

Enter Order ID: 2
Enter Amount: 800
Enter Delivery Charge: 80

Enter Order ID: 3
Enter Amount: 300
Enter Delivery Charge: 30
Output
Order ID: 1, Total Amount: 550
Order ID: 2, Total Amount: 880
Order ID: 3, Total Amount: 330*/
import java.util.*;
class Order{
	int orderId;
	int amount;
}
class OnlineOrder extends Order
{
	int deliveryCharge;
	void setData(int orderId,int amount,int deliveryCharge)
	{
		this.orderId=orderId;
		this.amount=amount;
		this.deliveryCharge=deliveryCharge;
	}
	void display()
	{
		System.out.println("Order ID :"+orderId+ ", Total Amount :"+(amount+deliveryCharge));
	}
	
}
class Q8Order
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Orders");
		int n=xyz.nextInt();
		OnlineOrder o[]=new OnlineOrder[n];
		for(int i=0;i<n;i++)
		{
			o[i]=new OnlineOrder();
			System.out.println("Enter order Id");
			int orderId=xyz.nextInt();
			System.out.println("Enter Amount");
			int amount=xyz.nextInt();
			System.out.println("Enter delivery Charge");
			int deliveryCharge=xyz.nextInt();
			
			o[i].setData(orderId,amount,deliveryCharge);
		}
		System.out.println("Order Details:");
		for(int i=0;i<n;i++)
		{
			o[i].display();
		}
	}
}