/*Question 50: Create abstract class Transport.
Asked In Practice Question
Abstract method calculateFare().
Subclasses:

Bus

Train

Fare = distance * rate.

Input
Type: Bus
Distance: 50
Rate: 2
Output
Fare: 100*/
import java.util.*;
abstract class Transport
{
	int distance;
	int rate;
	abstract void calculateFare();
}
class Bus extends Transport
{
	Bus(int distance,int rate)
	{
		this.distance=distance;
		this.rate=rate;
	}
	void calculateFare()
	{
		System.out.println("Fare :"+(distance*rate));
	}
}
class Train extends Transport
{
	Train(int distance,int rate)
	{
		this.distance=distance;
		this.rate=rate;
	}
	void calculateFare()
	{
		System.out.println("Fare :"+(distance*rate));
	}
	
}
class Q50Transport
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.Bus");
		System.out.println("2.Train");
		System.out.println("Enter Choice");
		int choice=xyz.nextInt();
		System.out.println("Enter Distance");
		int distance=xyz.nextInt();
		System.out.println("Enter rate");
		int rate=xyz.nextInt();
		Transport t;
		switch(choice)
		{
			case 1:
			t=new Bus(distance,rate);
			t.calculateFare();
			break;
			
			case 2:
			t=new Train(distance,rate);
			t.calculateFare();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
		
	}
}