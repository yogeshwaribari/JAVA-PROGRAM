/*Question 29: Write a Java program to implement a Bank Balance Validator using POJO class.
Create a POJO class Account with variables accountNumber and balance.
Using getter and setter methods:
- balance >= 10000 => Premium Account
- balance 5000 to 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Input:
Enter Account Number : 87654
Enter Balance : 4200

Output:
Account Number : 87654
Balance : 4200
Status : Low Balance Warning

Explanation:
A POJO class Account has private fields: accountNumber and balance.
Setter methods accept user input. Getter methods are used in the logic block.
If-else ladder:
- balance >= 10000 => Premium Account
- balance >= 5000 && balance <= 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Since 4200 < 5000, Status = Low Balance Warning.
This models a real banking classification system using POJO principles.

Asked In Companies:
Practice assignment*/
import java.util.*;
class Account
{
	private int accountNumber;
	private int balance;
	
	public void setAccountNumber(int accountNumber)
	{
	this.accountNumber=accountNumber;
	}
	public int getAccountNumber()
	{
	return accountNumber;
	}
	public void setBalance(int balance)
	{
	this.balance=balance;
	}
	public int getBalance()
	{
	return balance;
	}
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Account Number");
		setAccountNumber(xyz.nextInt());
		System.out.println("Enter Balance");
		setBalance(xyz.nextInt());
	}
	void BalanceCheck()
	{
		System.out.println("Account Number :"+getAccountNumber());
		System.out.println("Balance :"+getBalance());
		if(getBalance()>=10000)
		{
			System.out.println("Status :Premium Account");
		}
		else if(balance>=5000 && balance<=9999)
		{
			System.out.println("Status :Normal Account");
		}
		else{
			System.out.println("Status :Low Balance Warning");
		}
	
	}
	
}
class Q29POJOAccount
{
	public static void main(String x[])
	{
		Account a=new Account();
		a.putData();
		a.BalanceCheck();
	}
}