/*Question 36: Create a base class Event with attribute eventName.
Create a child class Ticket that adds price.
Create another child class VIPTicket that adds vipCharge.

Use this keyword and constructor chaining.
Store 2 tickets using array and calculate total price.
Asked In Practice Assignment
Description
Demonstrates event booking system using constructor chaining.
Input
Enter number of Tickets: 2

Enter Event: Concert
Enter Price: 1000
Enter VIP Charge: 500

Enter Event: Seminar
Enter Price: 800
Enter VIP Charge: 200
Output
Event: Concert, Total Price: 1500
Event: Seminar, Total Price: 1000*/
import java.util.*;
class Event
{
	String eventName;
	Event(String eventName)
	{
		this.eventName=eventName;
	}
}
class Ticket extends Event
{
	int price;
	Ticket(String eventName,int price)
	{
		super(eventName);
		this.price=price;
	}
}
class VIPTicket extends Ticket
{
	int vipCharge;
	VIPTicket(String eventName,int price,int vipCharge)
	{
		super(eventName,price);
		this.vipCharge=vipCharge;
	}
	void display()
	{
		int totalprice=price+vipCharge;
		System.out.println("Event :"+eventName+", Total Price :"+totalprice);	
	}
}
class Q36Event
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of tickets");
		int n=xyz.nextInt();
		VIPTicket v[]=new VIPTicket[n];
		for(int i=0;i<n;i++)
		{
			xyz.nextLine();
			System.out.println("Enter Event name");
			String eventName=xyz.nextLine();
			System.out.println("Enter Price");
			int price=xyz.nextInt();
			System.out.println("Enter VIP Charge");
			int vipCharge=xyz.nextInt();
			v[i]=new VIPTicket(eventName,price,vipCharge);
		}
		for(int i=0;i<n;i++)
		{
			v[i].display();
		}
	}
}