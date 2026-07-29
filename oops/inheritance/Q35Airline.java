/*Question 35: Create a base class Airline with attribute airlineName.
Create a child class Ticket that adds baseFare.
Create another child class BusinessTicket that adds luxuryCharge.
Use this keyword and constructor chaining.
Store 2 tickets using array and calculate total fare.
Asked In Practice Assignment
Description
Shows real-world airline booking system using inheritance and this.
Input
Enter number of Tickets: 2

Enter Airline: Indigo
Enter Base Fare: 4000
Enter Luxury Charge: 1500

Enter Airline: Air India
Enter Base Fare: 5000
Enter Luxury Charge: 2000
Output
Airline: Indigo, Total Fare: 5500
Airline: Air India, Total Fare: 7000*/
import java.util.*;
class Airline
{
	String airlineName;
	Airline(String airlineName)
	{
		this.airlineName=airlineName;
	}
}
class Ticket extends Airline
{
	int baseFare;
	Ticket(String airlineName,int baseFare)
	{
		super(airlineName);
		this.baseFare=baseFare;
	}
}
class BusinessTicket extends Ticket
{
	int luxuryCharge;
	BusinessTicket(String airlineName,int baseFare,int luxuryCharge)
	{
		super(airlineName,baseFare);
		this.luxuryCharge=luxuryCharge;
	}
	void display()
	{
		System.out.println("Airline :"+airlineName+", Total Fare :"+(baseFare+luxuryCharge));
	}
}
class Q35Airline
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of Tickets");
		int n=xyz.nextInt();
		BusinessTicket b[]=new BusinessTicket[n];
		for(int i=0;i<n;i++)
		{
			xyz.nextLine();
			System.out.println("Enter Airline");
			String airlineName=xyz.nextLine();
			System.out.println("Enter Base Fare");
			int baseFare=xyz.nextInt();
			System.out.println("Enter Luxury Charge");
			int luxuryCharge=xyz.nextInt();
			b[i]=new BusinessTicket(airlineName,baseFare,luxuryCharge);
		}
		for(int i=0;i<n;i++)
		{
			b[i].display();
		}
	}
}
