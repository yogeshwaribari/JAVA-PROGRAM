/*Question 18: Design a banking system.
Create a base class BankAccount with attributes accountHolderName and balance.
Create a child class SavingsAccount that adds interestRate.
Use super to initialize parent properties.
Store 3 accounts using an array of objects and calculate final balance after adding interest.
Asked In Practice Assignment
Description
This mini project demonstrates a banking system using inheritance and
interest calculation logic with array handling.
Input
Enter number of Accounts: 3

Enter Name: Amit
Enter Balance: 10000
Enter Interest Rate: 5

Enter Name: Neha
Enter Balance: 20000
Enter Interest Rate: 4

Enter Name: Raj
Enter Balance: 15000
Enter Interest Rate: 6
Output
Name: Amit, Final Balance: 10500
Name: Neha, Final Balance: 20800
Name: Raj, Final Balance: 15900*/
import java.util.*;
class BankAccount
{
	String name;
	int balance;
	void setData(String name,int balance)
	{
		this.name=name;
		this.balance=balance;
	}
}
class SavingsAccount extends BankAccount
{
	int interestRate;
	void data(String name,int balance,int interestRate)
	{
		super.setData(name,balance);
		this.interestRate=interestRate;
	}
	void display()
	{
		int intrest=(balance*interestRate)/100;
		int total=balance+intrest;
		System.out.println("Name :"+name+ ", Final Balance :"+total);
	}
}
class Q18BankAccount
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number of Accounts");
		int n=xyz.nextInt();
		SavingsAccount s[]=new SavingsAccount[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new SavingsAccount();
			System.out.println("Enter Name");
			String name=xyz.next();
			System.out.println("Enter Balance");
			int balance=xyz.nextInt();
			System.out.println("Enter Intrest");
			int interestRate=xyz.nextInt();
			s[i].data(name,balance,interestRate);
		}
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	}
}
