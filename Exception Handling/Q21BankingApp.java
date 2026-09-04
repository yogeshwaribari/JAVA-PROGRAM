/*Question 21: Write a Java program to create a banking application to withdraw money with 
exception handling.

Accept balance and withdraw amount. If the withdrawal amount is greater than the balance, 
throw a custom exception.
Asked In Practice Assignment
Input:
Enter balance: 5000
Enter withdraw amount: 7000

Output:
Insufficient Balance Exception

Explanation:
Banking operations require validation before processing. When withdrawal amount (7000) 
exceeds balance (5000), custom exception is thrown. This prevents invalid transactions and 
maintains account integrity through exception handling.*/
import java.util.*;
class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}
class Q21BankingApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Balance");
		int bal=xyz.nextInt();
		System.out.println("Enter Withdraw amt");
		int withdraw=xyz.nextInt();
		try
		{
			if(bal<withdraw)
			{
				throw new InsufficientBalanceException("Insufficient Balance Exception");
			}
			else
			{
				bal-=withdraw;
				System.out.println("Total :"+bal);
			}
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}
}