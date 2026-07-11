/*Question 116: Write a Java program to calculate vehicle rent using interface.
Asked In Practice Assignment
Create interface Vehicle with method calculateRent().
Implement in Bike and Car.

Bike ? ?10/km
Car ? ?25/km

Input:
Enter vehicle (1-Bike, 2-Car): 2
Enter distance: 10

Output:
Total Rent : 250*/
import java.util.*;
interface Vehicle
{
	void calculateRent();
}
class Bike implements Vehicle
{
	int distance;
	Bike(int distance)
	{
		this.distance=distance;
	}
	public void calculateRent()
	{
		int speed=10;
		System.out.println("Total Rent :"+(speed*distance));
	}
}
class Car implements Vehicle
{
	int distance;
	Car(int distance)
	{
		this.distance=distance;
	}
	public void calculateRent()
	{
		int speed=25;
		System.out.println("Total Rent :"+(speed*distance));
	}
}
class Q116Vehicle
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your choice 1.Bike 2.car");
		int choice=xyz.nextInt();
		Vehicle v;
		System.out.println("Enter Distance");
		int distance=xyz.nextInt();
		switch(choice)
		{
			case 1:
			v=new Bike(distance);
			v.calculateRent();
			break;
			
			case 2:
			v=new Car(distance);
			v.calculateRent();
			break;
			
			default:
			System.out.println("Wrong choice");
		}
	}
}