/*6. Write a Java program to demonstrate encapsulation using a `BankAccount` 
class with a private `balance` variable.  */
import java.util.*;
class BankAccount
{
	private int balance;
	
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public int getBalance()
	{
		return balance;
	}
	void display()
	{
		System.out.println("Balance :"+getBalance());
	}
}
class Q6BankAccount
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);

		BankAccount b=new BankAccount();
		System.out.println("Enter balance");
		b.setBalance(xyz.nextInt());
		b.display();
	}
}