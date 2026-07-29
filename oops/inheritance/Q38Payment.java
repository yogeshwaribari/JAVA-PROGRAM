/*Question 38: Create a base class Payment with method pay().
Create child classes CashPayment and CardPayment that override pay().
Use parent reference to call methods.
Asked In Practice Assignment
Description
Demonstrates runtime polymorphism using parent reference
Input
No input required
Output
Payment by Cash
Payment by Card*/
import java.util.*;
class Payment
{
	void pay()
	{
		System.out.println("Payment not specified");
	}
}
class CashPayment extends Payment
{
	void pay()
	{
		System.out.println("Payment by Cash");
	}
}
class CardPayment extends Payment
{
	void pay()
	{
		System.out.println("Payment by Card");
	}
}
class Q38Payment
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Payment p=new CashPayment();
		p.pay();
		
		Payment p1=new CardPayment();
		p1.pay();
	}
}