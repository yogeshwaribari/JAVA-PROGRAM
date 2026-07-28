/*Question 49: Create abstract class ElectricityBill.
Asked In Practice Question
Abstract method calculateBill().
Subclasses:

Domestic

Commercial

Different per-unit charges.

Input
Type: Domestic
Units: 100
Rate: 5
Output
Bill Amount: 500*/
import java.util.*;
abstract class ElectricityBill
{
	int unit;
	int rate;
	abstract void calculateBill();
}
class Domestic extends ElectricityBill
{
	Domestic(int unit,int rate)
	{
		this.unit=unit;
		this.rate=rate;
	}
	void calculateBill()
	{
		System.out.println("Bill Amount :"+(unit*rate));
	}
}
class Commercial extends ElectricityBill
{
	Commercial(int unit,int rate)
	{
		this.unit=unit;
		this.rate=rate;
	}
	void calculateBill()
	{
		System.out.println("Bill Amount :"+(unit*rate));
	}
}
class Q49ElectricityBill
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.Domestic");
		System.out.println("2.Commercial");
		System.out.println("Enter Choice");
		int choice=xyz.nextInt();
		System.out.println("Enter units");
		int unit=xyz.nextInt();
		System.out.println("Enter Rate");
		int rate=xyz.nextInt();
		ElectricityBill e;
		
		switch(choice)
		{
			case 1:
			e=new Domestic(unit,rate);
			e.calculateBill();
			break;
			
			case 2:
			e=new Commercial(unit,rate);
			e.calculateBill();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}
