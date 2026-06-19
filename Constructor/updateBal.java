/*Question 22: Write a Java program to create Account objects and deposit amount.

Description: Create Account class with accountNumber, name and balance. Accept deposit 
amount and update balance.
INPUT:
Account: 101 Raj 5000
Deposit Amount: 2000

OUTPUT:
Updated Balance: 7000

EXPLANATION:
Create Account class with fields accountNumber, name, balance. Use constructor 
public Account(int accNo, String n, int bal) to initialize with 101, "Raj", 5000.
 Create deposit(int amount) method to add amount to balance. Call deposit(2000). 
 New balance = 5000 + 2000 = 7000. Display updated balance.*/
 import java.util.*;
 class Account
 {
	 int accountNumber;
	 String name;
	 int balance;
	 
	 Account(int accNo,String n,int bal)
	 {
		 accountNumber=accNo;
		 name=n;
		 balance=bal;
	 }
	 void deposit(int amt)
	 {
		 balance=balance+amt;
	 }
	 
	 void display()
	 {
		 System.out.println("Updated Balance : "+balance);
	 }
 }
 class updateBal
 {
	 public static void main(String x[])
	 {
		 Scanner xyz=new Scanner(System.in);
		
		 System.out.println("Enter Account Number");
		 int accountNumber=xyz.nextInt();
		 System.out.println("Enter Name");
		 String name=xyz.next();
		 System.out.println("Enter Balance");
		 int balance=xyz.nextInt();
		 Account a=new Account(accountNumber,name,balance);
		 System.out.println("Enter Deposite Amount");
		 int damt=xyz.nextInt();
		 
		 a.deposit(damt);
		 a.display();
		 
		 
	 }
 }