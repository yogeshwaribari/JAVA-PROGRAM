/*Question 10: Write a Java program to create a BankAccount class and check minimum balance condition.

Description: Create BankAccount class with accountNumber, customerName and balance. Initialize using
 constructor. If balance < 1000 display Minimum Balance Warning otherwise Valid Balance.
INPUT:
Enter Account Number: 12345
Enter Customer Name: Suresh
Enter Balance: 800

OUTPUT:
Customer Name: Suresh
Status: Minimum Balance Warning

EXPLANATION:
Create BankAccount with fields accountNumber, customerName, balance. Use constructor to initialize. 
Check if balance < 1000 then print "Minimum Balance Warning" else "Valid Balance". Display customer name 
and status.
*/
import java.util.*;
class BankAccount
{
	int accountNumber;
	String customerName;
	int balance;
	
	BankAccount(int accountNumber,String customerName,int balance)
	{
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.balance=balance;
	}
	void display()
	{
		System.out.println("Customer Name:"+customerName);
		if(balance<1000)
		{
			System.out.println("Status: Minimum Balance Warning");
		}
		else{
			System.out.println("Status: Valid Balance");
		}
	}
}
class constaBankAccount{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Account Number");
		int accountNumber=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Customer Name");
		String customerName=xyz.nextLine();
		System.out.println("Enter Balance");
		int balance=xyz.nextInt();
		
		BankAccount b=new BankAccount(accountNumber,customerName,balance);
		b.display();
	}
}