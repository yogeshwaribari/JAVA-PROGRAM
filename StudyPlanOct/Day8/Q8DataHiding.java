/*8. Write a Java program to demonstrate Data Hiding using the private access modifier.
Create a BankAccount class with a private balance and methods to deposit and display the balance.*/

class BankAccount
{
	private int bal;
	
	
	void deposit(int deposit)
	{
		bal=bal+deposit;
	}
	void display()
	{
		System.out.println("Balance = "+bal);
	}
}
class Q8DataHiding
{
	public static void main(String x[])
	{
		BankAccount b=new BankAccount();
		b.deposit(2000);
		b.display();
	}
}
 