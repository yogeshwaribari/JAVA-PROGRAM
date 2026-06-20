/*Question 4: Create a base class Account with accountNumber and balance.
Create a child class SavingsAccount that adds interestRate.
Calculate final balance after adding interest.
Asked In: Practice Assignment
Description
This program uses inheritance to simulate a banking system.
The child class extends functionality by applying interest calculation.

Input
Enter Account Number: 12345
Enter Balance: 10000
Enter Interest Rate: 5

Output
Account Number: 12345
Initial Balance: 10000
Interest: 500
Final Balance: 10500*/
import java.util.*;
class Account
{
	int accountNumber;
	int balance;
}
class SavingsAccount extends Account
{
	int interestRate;
	void setData(int accountNumber,int balance,int interestRate)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.interestRate=interestRate;
	}
	void display()
	{
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Initial Balance :"+balance);
		interestRate=(balance*interestRate)/100;
		System.out.println("Interest :"+interestRate);
		int total=interestRate+balance;
		System.out.println("Total :"+total);
		
	}
}
class Q4Account
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Account Number");
		int accountNumber=xyz.nextInt();
		System.out.println("Enter balance");
		int balance=xyz.nextInt();
		System.out.println("Enter Intrest Rate");
		int interestRate=xyz.nextInt();
		
		SavingsAccount s=new SavingsAccount();
		s.setData(accountNumber,balance,interestRate);
		s.display();
	}
}