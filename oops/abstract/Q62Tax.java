/*Question 62: Create abstract class Tax.
Asked In Practice Question
Abstract method calculateTax().
Subclasses:

IncomeTax

GST

Input
Amount: 50000
Tax Rate: 10%
Output
Tax: 5000*/
import java.util.*;
abstract class Tax
{
	abstract void calculateTax();
	int amt;
	int rate;
	Tax(int amt,int rate)
	{
		this.amt=amt;
		this.rate=rate;
	}
}
class IncomeTax extends Tax
{
	IncomeTax(int amt,int rate)
	{
		super(amt,rate);
	}
	void calculateTax()
	{
		int tax=amt*rate/100;
		System.out.println("Tax :"+tax);
	}
}
class GST extends Tax{
	GST(int amt,int rate)
	{
		super(amt,rate);
	}
	void calculateTax()
	{
		int tax=amt*rate/100;
		System.out.println("Tax :"+tax);
	}
}
class Q62Tax
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.IncomeTax\n2.Tax");
		System.out.println("Enter your choice");
		int n=xyz.nextInt();
		Tax t;
		switch(n)
		{
			case 1:
			System.out.println("Enter Amount");
			int amt=xyz.nextInt();
			System.out.println("Enter rate");
			int rate=xyz.nextInt();
			t=new IncomeTax(amt,rate);
			t.calculateTax();
			break;
			
			case 2:
			System.out.println("Enter Amount");
			 amt=xyz.nextInt();
			System.out.println("Enter rate");
			 rate=xyz.nextInt();
			t=new GST(amt,rate);
			t.calculateTax();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}