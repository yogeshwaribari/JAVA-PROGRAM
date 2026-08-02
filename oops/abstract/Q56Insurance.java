/*Question 56: Create abstract class Insurance.
Asked In Practice Question
Abstract method calculatePremium().
Subclasses:

LifeInsurance

VehicleInsurance

Input
Type: Life
Amount: 100000
Rate: 5%
Output
Premium: 5000*/
import java.util.*;
abstract class Insurance
{
	int amt;
	int rate;
	Insurance(int amt,int rate)
	{
		this.amt=amt;
		this.rate=rate;
	}
	abstract void calculatePremium();
}
class LifeInsurance extends Insurance
{
	LifeInsurance(int amt,int rate)
	{
		super(amt,rate);
	}void calculatePremium(){
	int premium=amt*rate/100;
	System.out.println("Premium :"+premium);
	}
}
class VehicleInsurance extends Insurance
{
	VehicleInsurance(int amt,int rate)
	{
		super(amt,rate);
	}
	void calculatePremium()
	{
	int premium=amt*rate/100;
	System.out.println("Premium :"+premium);
	}
}
class Q56Insurance
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("choose your Insurance Type \n 1.Life Insurance \n 2.Vehicle Insurance");
		System.out.println("Enter choice");
		int choice=xyz.nextInt();
		Insurance i;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Amount");
			int amt=xyz.nextInt();
			System.out.println("Enter Rate");
			int rate=xyz.nextInt();
			i=new LifeInsurance(amt,rate);
			i.calculatePremium();
			break;
			case 2:
			System.out.println("Enter Amount");
			 amt=xyz.nextInt();
			System.out.println("Enter Rate");
			 rate=xyz.nextInt();
			i=new VehicleInsurance(amt,rate);
			i.calculatePremium();
			break;
			
			default:
			System.out.println("Wrong choice");
		}
	}
}