/*Question 44: Create an abstract class BankAccount to perform banking operations.
Asked In Practice Question
Create abstract class BankAccount with:

Abstract methods deposit() and withdraw()

Variable balance

Create subclasses:

SavingsAccount ? minimum balance required

CurrentAccount ? no minimum balance

Program should perform deposit and withdrawal operations and display final balance.

Input
Account Type: Savings
Initial Balance: 1000
Deposit: 500
Withdraw: 300
Output
Final Balance: 1200*/
import java.util.*;
abstract class BankAccount
{
	int balance;
	abstract void deposit(int amt);
	abstract void withdraw(int amt);
	void display()
	{
		System.out.println("Final Balance :"+balance);
	}
}
class SavingsAccount extends BankAccount
{
	SavingsAccount(int balance)
	{
		this.balance=balance;
	}
	public void deposit(int amt)
	{
		balance+=amt;
	}
	public void withdraw(int amt)
	{
		if(balance-amt>=500)
		{
			balance-=amt;
		}
		else 
		{
			System.out.println("Minimum Balance Should be 500");
		}
	}
	
}
class CurrentAccount extends BankAccount
{
	CurrentAccount(int balance)
	{
		this.balance=balance;
	}
	void deposit(int amt)
	{
		balance+=amt;
	}
	void withdraw(int amt)
	{
		balance-=amt;
	}
}
class Q44BankAccount
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your Account (Savings/CurrentAccount)");
		String acc=xyz.next();
		
		System.out.println("Enter Initial Balance");
		int balance=xyz.nextInt();
		System.out.println("Enter Deposit Amt");
		int deposit=xyz.nextInt();
		System.out.println("Enter Withdraw amt");
		int withdraw=xyz.nextInt();
		
		BankAccount b;
		
		if(acc.equalsIgnoreCase("Savings"))
		{
			b=new SavingsAccount(balance);
		}
		else{
			b=new CurrentAccount(balance);
		}
		b.deposit(deposit);
		b.withdraw(withdraw);
		b.display();
	}
}