/*Scenario
1. Vehicle Management System
Scenario: A transportation company manages Cars, Bikes, and Trucks. Every vehicle has a 
different way of calculating fuel consumption.
Question: How would you design a calculateFuelConsumption() method using polymorphism?*/
class Vehical
{
	void calculateFuelConsumption()
	{
		System.out.println("Calculate Fuel Consumption");
	}
}
	class Cars extends Vehical
	{
		void calculateFuelConsumption()
		{
			System.out.println("Car fuel consumption: 15 km per liter");
		}
	}
	
	class Bikes extends Vehical
	{
		void calculateFuelConsumption()
		{
			System.out.println("Bikes fuel consumption: 45 km per liter");
		}
	}
	class Trucks extends Vehical
	{
		void calculateFuelConsumption()
		{
			System.out.println("Trucks fuel consumption: 8 km per liter");
		}
	}

class VehicalData
{
	public static void main(String x[])
	{
		//Vehical v=new Vehical();
		Vehical v1=new Cars();
		Vehical v2=new Bikes();
		Vehical v3=new Trucks();
		//v.calculateFuelConsumption();
		v1.calculateFuelConsumption();
		v2.calculateFuelConsumption();
		v3.calculateFuelConsumption();
	}
}