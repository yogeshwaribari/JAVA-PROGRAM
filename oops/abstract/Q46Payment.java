/*Question 46: Create an abstract class Payment to process different payment methods.
Asked In Practice Question
Create abstract class Payment with:

Abstract method payAmount()

Create subclasses:

CreditCardPayment

UPIPayment

Each subclass should display payment mode and amount paid.

Input
Payment Method: UPI
Amount: 2000
Output
Payment done using UPI
Amount Paid: 2000
*/
import java.util.*;
abstract class Payment
{
	int amt;
	abstract void PayAmount();
}
class CreditCardPayment extends Payment
{
	CreditCardPayment(int amt)
	{
		this.amt=amt;
	}
	public void PayAmount()
	{
		System.out.println("Payment done using Credit Card Payment");
		System.out.println("Amount Paid :"+amt);
	}
}
class UPIPayment extends Payment
{
	UPIPayment(int amt)
	{
		this.amt=amt;
	}
	public void PayAmount()
	{
		System.out.println("Payment done using UPI");
		System.out.println("Amount paid :"+amt);
	}
}
class Q46Payment
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.Credit Card Payment");
		System.out.println("2.UPI Payment");
		System.out.println("Enter your Choice");
		int choice=xyz.nextInt();
		Payment p;
		System.out.println("Enter Amount");
		int amt=xyz.nextInt();
		switch(choice)
		{
			case 1:
			p=new CreditCardPayment(amt);
			p.PayAmount();
			break;
			
			case 2:
			p=new UPIPayment(amt);
			p.PayAmount();
			break;
			
			default:
			System.out.println("Wrong choice");
		}
	}
}