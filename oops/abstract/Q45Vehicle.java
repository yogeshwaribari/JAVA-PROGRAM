/*Question 45: Create an abstract class Vehicle to calculate fuel consumption.
Asked In Practice Question
Create abstract class Vehicle with:

Abstract method calculateMileage()

Create subclasses:

Car ? mileage = distance / fuel

Bike ? mileage = distance / fuel

Program should calculate mileage based on input values.

Input
Vehicle: Car
Distance: 150 km
Fuel: 10 liters
Output
Mileage: 15 km/l*/
import java.util.*;
abstract class Vehicle
{
	int distance,fuel;
	abstract void calculateMileage();
}
class Car extends Vehicle
{
	Car(int distance,int fuel)
	{
		this.distance=distance;
		this.fuel=fuel;
	}
	public void calculateMileage()
	{
	double mileage=distance/fuel;
		System.out.println("Mileage :"+mileage+"km/l");
	}
}
class Bike extends Vehicle
{
	Bike(int distance,int fuel)
	{
		this.distance=distance;
		this.fuel=fuel;
	}
	public void calculateMileage()
	{
		double mileage=distance/fuel;
		System.out.println("Mileage :"+mileage+"km/l");
	}
}
class Q45Vehicle
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Vehicle type (car/bike)");
		String s=xyz.next();
		
		System.out.println("Enter Distance");
		int distance=xyz.nextInt();
		System.out.println("Enter Fuel");
		int fuel=xyz.nextInt();
		Vehicle v;
		
		if(s.equals("car"))
		{
			v=new Car(distance,fuel);
		}
		else
		{
			v=new Bike(distance,fuel);
		}
		v.calculateMileage();
	}
}