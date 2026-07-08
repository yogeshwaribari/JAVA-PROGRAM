/*Question 113: Write a Java program to implement an online payment system using interface
Asked In Practice Assignment
Create an interface Payment with method pay().
Implement classes UPI and NetBanking.
Display payment method based on user choice.

Input:
Enter choice (1-UPI, 2-NetBanking): 1
Enter amount: 1500

Output: Paid 1500 using UPI*/
import java.util.*;
interface Payment
{
	void pay();
}
class UPI implements Payment
{
	int amt;
	UPI(int amt)
	{
		this.amt=amt;
	}
	public void pay()
	{
		System.out.println("Paid "+amt+" using UPI");
	}
	
}
class NetBanking implements Payment
{
	int amt;
	NetBanking(int amt)
	{
		this.amt=amt;
	}
	public void pay()
	{
		System.out.println("Paid "+amt+" using NetBanking");
	}
}
class Q113OnlinePayment
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your choice 1.UPI 2.NetBanking");
		int choice=xyz.nextInt();
		
		Payment p;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Amount");
			int amt=xyz.nextInt();
			p=new UPI(amt);
			p.pay();
			break;
			
			case 2:
			System.out.println("Enter amount");
			int amt1=xyz.nextInt();
			p=new NetBanking(amt1);
			p.pay();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}