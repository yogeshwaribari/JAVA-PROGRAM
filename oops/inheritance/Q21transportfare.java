/*Question 21: Design a transport fare system.
Create a base class Vehicle with attributes type and baseFare.
Create a child class Trip that adds distance and ratePerKm.
Use super keyword to initialize parent class.
Store 3 trips using an array of objects and calculate total fare.
Asked In Practice Assignment
Description
This project demonstrates a transport fare calculation system combining base fare and distance
charges using inheritance.
Input
Enter number of Trips: 3

Enter Vehicle Type: Auto
Enter Base Fare: 30
Enter Distance: 10
Enter Rate per Km: 10

Enter Vehicle Type: Cab
Enter Base Fare: 50
Enter Distance: 15
Enter Rate per Km: 12

Enter Vehicle Type: Bike
Enter Base Fare: 20
Enter Distance: 8
Enter Rate per Km: 8
Output
Vehicle: Auto, Total Fare: 130
Vehicle: Cab, Total Fare: 230
Vehicle: Bike, Total Fare: 84*/
import java.util.*;
class Vehicle
{
	String type;
	int basefare;
	void setData(String type,int basefare)
	{
		this.type=type;
		this.basefare=basefare;
	}
}
class Trip extends Vehicle
{
	int distance;
	int ratePerKm;
	void Data(String type,int basefare,int distance,int ratePerKm)
	{
		super.setData(type,basefare);
		this.distance=distance;
		this.ratePerKm=ratePerKm;
	}
	void display()
	{
		int totalfare=(distance*ratePerKm)+basefare;
		System.out.println("Vehicle :"+type+", Total Fare :"+totalfare);
	}
}
class Q21transportfare
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Trips");
		int n=xyz.nextInt();
		Trip t[]=new Trip[n];
		for(int i=0;i<n;i++)
		{
			t[i]=new Trip();
			System.out.println("Enter Vehicle Type");
			String type=xyz.next();
			System.out.println("Enter Base Fare");
			int basefare=xyz.nextInt();
			System.out.println("Enter Distance");
			int distance=xyz.nextInt();
			System.out.println("Enter Rate per Km");
			int ratePerKm=xyz.nextInt();
			t[i].Data(type,basefare,distance,ratePerKm);
		}
		for(int i=0;i<n;i++)
		{
			t[i].display();
		}
	}
}