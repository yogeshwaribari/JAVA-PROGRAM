/*Question 59: Create abstract class Loan.
Asked In Practice Question
Abstract method calculateInterest().
Subclasses:

HomeLoan

CarLoan

Input
Amount: 100000
Rate: 8%
Output
Interest: 8000*/
import java.util.*;
abstract class Loan
{
	int amt;
	int rate;
	Loan(int amt,int rate)
	{
		this.amt=amt;
		this.rate=rate;
	}
	abstract void calculateInterest();
} 
class HomeLoan extends Loan
{
	HomeLoan(int amt,int rate)
	{
		super(amt,rate);
	}
	void calculateInterest()
	{
		int interest=amt*rate/100;
		System.out.println("Interest :"+interest);
	}
}
class CarLoan extends Loan
{
	CarLoan(int amt,int rate)
	{
		super(amt,rate);
	}
	void calculateInterest()
	{
		int interest=amt*rate/100;
		System.out.println("Interest :"+interest);
	}
}
class Q59Loan
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.HomeLoan\n2.CarLoan");
		System.out.println("Enter choice");
		int choice=xyz.nextInt();
		Loan l;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Amount");
			int amt=xyz.nextInt();
			System.out.println("Enter Rate");
			int rate=xyz.nextInt();
			l=new HomeLoan(amt,rate);
			l.calculateInterest();
			break;
			
			case 2:
			System.out.println("Enter Amount");
			amt=xyz.nextInt();
			System.out.println("Enter Rate");
			rate=xyz.nextInt();
			l=new CarLoan(amt,rate);
			l.calculateInterest();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}