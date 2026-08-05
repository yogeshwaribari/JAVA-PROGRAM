/*1. Online Banking System
A bank wants to develop an application with the following requirements:
 Create a superclass Account containing common properties like account number, holder name, 
and balance.
 Create subclasses SavingsAccount and CurrentAccount.
 Every account must implement a method to calculate yearly charges, but the calculation is 
different for each account type.
 Ensure the account number cannot be modified after object creation.
 Use the parent constructor to initialize common data.
 The bank manager should be able to access all account types using a single reference.
 The interest calculation method in the parent should not be inherited directly.
 The project should follow loose coupling so that new account types can be added without 
changing existing code.
Implement using:
 Inheritance
 Abstract Class
 Method Overriding
 super() Constructor
 final Keyword
 Dynamic Polymorphism
 Interface
 Loose Coupling*/
import java.util.*;
interface Calculatecharge
{
	void calculateyearly();
}
abstract class Account implements calculatecharge{
	final int accountNo;
	String name;
	int balance;
	Account(int accountNo,String name,int balance)
	{
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
	}
	abstract void calculateIntrest();
}
class SavingsAccount extends Account
{
	SavingsAccount(int accountNo,String name,int balance)
	{
		super(accountNo,name,balance);
	}
	void calculateIntrest()
	{
		int interest=balance*5/100;
		System.out.println("Intrest :"+interest);
	}
	public void calculateyearly()
	{
		int charges=300;
		System.out.println("Yearly Charges :"+charges);
	}
}
class CurrentAccount extends Account
{
	CurrentAccount(int accountNo,String name,int balance)
	{
		super(accountNo,name,balance);
	}
	void calculateIntrest()
	{
		System.out.println("No Intrest");
	}
	public void calculateyearly()
	{
		int charges=2000;
		System.out.println("Yearly Charges :"+charges);
	}
}
class OnlineBankingSystem
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		System.out.println("Enter choice");
		int choice=xyz.nextInt();
		Account a;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Account number");
			int accountNo=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter holder name");
			String name=xyz.nextLine();
			System.out.println("Enter balance");
			int balance=xyz.nextInt();
			a=new SavingsAccount(accountNo,name,balance);
			a.calculateyearly();
			a.calculateIntrest();
			break;
			
			case 2:
			System.out.println("Enter Account number");
			 accountNo=xyz.nextInt();
			xyz.nextLine();
			System.out.println("Enter holder name");
			 name=xyz.nextLine();
			System.out.println("Enter balance");
			 balance=xyz.nextInt();
			a=new CurrentAccount(accountNo,name,balance);
			a.calculateyearly();
			a.calculateIntrest();
			break;
			
			default:
			System.out.println("Wrong choice");
		}
	}
}