/*Question 16: Design a cab booking system.
Create a base class Ride with attributes customerName and distance.
Create a child class Cab that adds ratePerKm.
Use super keyword to initialize parent properties.
Store 2 rides using an array of objects and calculate fare.
Asked In Practice Assignment
Description
This assignment demonstrates a cab fare calculation system using inheritance and arrays.
Input
Enter number of Rides: 2

Enter Customer Name: Rahul
Enter Distance: 10
Enter Rate per Km: 15

Enter Customer Name: Sneha
Enter Distance: 20
Enter Rate per Km: 12
Output
Customer: Rahul, Fare: 150
Customer: Sneha, Fare: 240*/
import java.util.*;
class Ride{
	String customerName;
	int distance;
	void setData(String customerName,int distance)
	{
		this.customerName=customerName;
		this.distance=distance;
	}
}
class Cab extends Ride
{
	int ratePerKm;
	void data(String customerName,int distance,int ratePerKm)
	{
		super.setData(customerName,distance);
		this.ratePerKm=ratePerKm;
	}
	void display()
	{
		int fare=distance*ratePerKm;
		System.out.println("Customer :"+customerName+ ", Fare :"+fare);
	}
}
class Q16Ride
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Rides");
		int n=xyz.nextInt();
		Cab c[]=new Cab[n];
		
		for(int i=0;i<n;i++)
		{
			c[i]=new Cab();
			System.out.println("Enter Customer Name");
			String customerName=xyz.next();
			System.out.println("Enter Distance");
			int distance=xyz.nextInt();
			System.out.println("Enter ratePerKm");
			int ratePerKm=xyz.nextInt();
			c[i].data(customerName,distance,ratePerKm);
			
		}
		
		for(int i=0;i<n;i++)
		{
			c[i].display();
		}
		
	}
}