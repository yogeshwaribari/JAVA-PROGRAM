/*
Question 59: Develop a program to simulate a basic banking menu:
1: Deposit
2: Withdraw
3: Check Balance
4: Exit
Use a switch to handle user choice and print appropriate messages.
Input:
Choice = 1 (Deposit)
Amount = 2000

Output
Amount Deposited. New Balance = 7000

Explanation:
When choice 1 is selected, deposit amount is added to balance.

Input:
Choice = 3

Output:
Current Balance = 5000

Explanation:
Choice 3 prints the current account balance.
*/
import java.util.Scanner;
class BankingSwitch
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1: Deposit \n2: Withdraw \n3: Check Balance \n4: Exit");
		int c = xyz.nextInt();
		
		switch(c)
		{
			case 1 :
			System.out.println("Enter Amount");
			int amt = xyz.nextInt();			
			System.out.println("Enter Deposit Amount");
			int d = xyz.nextInt();
			amt = amt + d;
			System.out.println("Amount Deposited. \nNew Balance = "+amt);
			break;
			case 2 : 
			System.out.println("Enter Amount");
		    amt = xyz.nextInt();
			System.out.println("Enter Withdraw Amount");
			int w = xyz.nextInt();
			amt = amt - w;
			System.out.println("Amount Withdraw. \nNew Balance = "+amt);
			break;
			case 3 : 
			System.out.println("Enter Amount");
		    amt = xyz.nextInt();
			System.out.println("Current Balance ="+amt);
			break;
			case 4:
			System.exit(0);
			default :
			
			break;
			
		}
	}
}