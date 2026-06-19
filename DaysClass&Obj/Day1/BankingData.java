/*Banking Application
In an online banking system, customers can transfer money using an account number, mobile number, 
or UPI ID. How would you design a transferMoney() method using function overloading to handle 
these different ways of transferring money?
Scenario: A banking application allows money transfers through different methods.
Case 1: The customer transfers money using the  beneficiary account number.
Case 2: The customer transfers money using a registered mobile number.
Case 3: The customer transfers money using a *UPI ID*.*/
import java.util.*;
class Banking
{
	void transferMoney(long accNo,double amt)
	{
		System.out.println("Account No:"+accNo);
		System.out.println("Amount :"+amt);
	}
	void transferMoney(long number,float amt)
	{
		System.out.println("Number:"+number);
		System.out.println("Amount :"+amt);
	}
	void transferMoney(String upiid,double amt)
	{
		System.out.println("UPIID:"+upiid);
		System.out.println("Amount :"+amt);
	}
	
}
class BankingData
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Banking b=new Banking();
		
		System.out.println("Enter Account No");
		long accNo=xyz.nextLong();
		System.out.println("Enter Amount");
		double amt=xyz.nextDouble();
		xyz.nextLine();
		System.out.println("Enter Mobile No");
		long phoneNo=xyz.nextLong();
		System.out.println("Enter Amount");
		float amt2=xyz.nextFloat();
		xyz.nextLine();
		System.out.println("Enter UPI ID");
		String upiid=xyz.nextLine();
		System.out.println("Enter Amount");
		double amt3=xyz.nextDouble();
		
		b.transferMoney(accNo,amt);
		b.transferMoney(phoneNo,amt2);
		b.transferMoney(upiid,amt3);
	}
}