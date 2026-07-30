/*Question 39: Create a base class Transport with attribute type.
Create a child class Ride that adds fare.
Create another child class PremiumRide that adds extraCharge.

Use this and super().
Store 3 rides using array and calculate total fare.
Asked In Practice Assignment
Description
Simulates a ride-booking application like Uber/Ola.
Input
Enter number of Rides: 3

Enter Type: Bike
Enter Fare: 100
Enter Extra Charge: 20

Enter Type: Car
Enter Fare: 200
Enter Extra Charge: 50

Enter Type: Auto
Enter Fare: 150
Enter Extra Charge: 30
Output
Type: Bike, Total Fare: 120
Type: Car, Total Fare: 250
Type: Auto, Total Fare: 180*/
import java.util.*;
class Transport
{
	String type;
	Transport(String type)
	{
		this.type=type;
	}
}
class Ride extends Transport
{
	int fare;
	Ride(String type,int fare)
	{
		super(type);
		this.fare=fare;
	}
}
class PremiumRide extends Ride
{
	int extraCharge;
	PremiumRide(String type,int fare,int extraCharge)
	{
		super(type,fare);
		this.extraCharge=extraCharge;
	}
	void display()
	{
		int totalfare=fare+extraCharge;
		System.out.println("Type :"+type+", Total Fare :"+totalfare);
	}
}
class Q39Transport
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of rides");
		int n=xyz.nextInt();
		PremiumRide p[]=new PremiumRide[n];
		for(int i=0;i<n;i++)
		{
			xyz.nextLine();
			System.out.println("Enter Type");
			String type=xyz.nextLine();
			System.out.println("Enter Fare");
			int fare=xyz.nextInt();
			System.out.println("Enter Extra charges");
			int extraCharge=xyz.nextInt();
			p[i]=new PremiumRide(type,fare,extraCharge);
		}
		for(int i=0;i<n;i++)
		{
			p[i].display();
		}
	}
}