/*Question 8: Write a Java program to implement a Bank Balance Checker.
Create a class BankAccount with attributes accountNumber, name, and balance.
Check account status:
- balance >= 10000 => Premium Account
- balance 5000 to 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Input:
Enter Account Number : 98765
Enter Name : Neha
Enter Balance : 4500

Output:
Account Number : 98765
Name : Neha
Balance : 4500
Status : Low Balance Warning

Explanation:
A class BankAccount is created with accountNumber, name, and balance.
The user inputs all three values via Scanner.
An if-else ladder determines the account status:
- balance >= 10000 => Premium Account
- balance >= 5000 && balance <= 9999 => Normal Account
- balance < 5000 => Low Balance Warning
Since 4500 < 5000, the status is Low Balance Warning.
This program models a real-world banking classification using class objects.

Asked In Companies:
Practice assignment*/
import java.util.*;
class BankAccount{
	int accountNumber;
	String name;
	int balance;
	
	void putData(){
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter account Number");
		accountNumber=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Name");
		name=xyz.nextLine();
		System.out.println("Enter Balance");
		balance=xyz.nextInt();
	}
	void getData()
	{
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Name : "+name);
		System.out.println("Balance : "+balance);
		if(balance>=10000)
		{
			System.out.println("Status : Premium Account");
		}
		else if(balance>=5000 && balance<=9999)
		{
			System.out.println("Status : Normal Account");
		}
		else{
			System.out.println("Status : Low Balance Warning");
		}
		
	}
	public static void main(String x[])
	{
		BankAccount b=new BankAccount();
		b.putData();
		b.getData();
	}
}