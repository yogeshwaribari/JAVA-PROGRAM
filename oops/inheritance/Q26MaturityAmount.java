/*Question 26: Create a base class Account with attributes accountNumber.
Create a child class Savings that adds balance.
Create another child class FixedDeposit that adds interestRate.
Use constructor chaining (super()) to initialize all fields.
Store 2 accounts using an array of objects and calculate maturity amount.
Asked In Practice Assignment
Description
This assignment demonstrates financial system using multilevel
inheritance and constructor chaining.
Input
Enter number of Accounts: 2

Enter Account Number: 101
Enter Balance: 10000
Enter Interest Rate: 5

Enter Account Number: 102
Enter Balance: 20000
Enter Interest Rate: 6
Output
Account: 101, Maturity Amount: 10500
Account: 102, Maturity Amount: 21200*/
import java.util.*;
class Account
{
	int accountNumber;
	Account(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
}
class Saving extends Account
{
	int balance;
	Saving(int accountNumber,int balance)
	{
		super(accountNumber);
		this.balance=balance;
	}
}
class FixedDeposit extends Saving
{
	int interestRate;
	FixedDeposit(int accountNumber,int balance,int interestRate)
	{
		super(accountNumber,balance);
		this.interestRate=interestRate;
	}
	void display()
	{
		int amt=balance+(balance*interestRate)/100;
		System.out.println("Maturity Amount :"+amt);
	}
}
class Q26MaturityAmount
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Number of Accounts");
		int n=xyz.nextInt();
		FixedDeposit f[]=new FixedDeposit[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Account Number");
			int accountNumber=xyz.nextInt();
			System.out.println("Enter Balance");
			int balance=xyz.nextInt();
			System.out.println("Enter Interest Rate");
			int interestRate=xyz.nextInt();
			f[i]=new FixedDeposit(accountNumber,balance,interestRate);
		}
		for(int i=0;i<n;i++)
		{
			f[i].display();
		}
	}
}