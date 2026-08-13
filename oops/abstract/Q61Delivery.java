/*Question 61: Create abstract class Delivery.
Asked In Practice Question
Abstract method calculateCharges().
Subclasses:

LocalDelivery

InternationalDelivery

Input
Weight: 2kg
Rate: 50
Output
Charges: 100*/
import java.util.*;
abstract class Delivery
{
	abstract void calculateCharges();
	int weight;
	int rate;
	Delivery(int weight,int rate)
	{
		this.weight=weight;
		this.rate=rate;
	}
}
class LocalDelivery extends Delivery //localdelivery
{
	LocalDelivery(int weight,int rate)
	{
		super(weight,rate);
	}
	void calculateCharges()
	{
		System.out.println("Charges :"+(weight*rate));
	}
}
class InternationalDelivery extends Delivery //internationaldelivery
{
	InternationalDelivery(int weight,int rate)
	{
		super(weight,rate);
	}
	void calculateCharges()
	{
		System.out.println("Charges :"+(weight*rate*1.5));
	}
}
class Q61Delivery
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.LocalDelivery\n2.InternationalDelivery");
		System.out.println("Enter choice");
		int choice=xyz.nextInt();
		Delivery d;
		switch(choice)
		{
			case 1:
			System.out.println("Enter weight");
			int weight=xyz.nextInt();
			System.out.println("Enter rate");
			int rate=xyz.nextInt();
			d=new LocalDelivery(weight,rate);
			d.calculateCharges();
			break;
			
			case 2:
			System.out.println("Enter weight");
			 weight=xyz.nextInt();
			System.out.println("Enter rate");
			 rate=xyz.nextInt();
			d=new InternationalDelivery(weight,rate);
			d.calculateCharges();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}