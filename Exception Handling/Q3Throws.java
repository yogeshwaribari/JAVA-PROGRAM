/*3. Create a method withdraw(double balance, double amount) that throws an 
IllegalArgumentException if the withdrawal amount is zero or negative and an ArithmeticException 
if the amount exceeds the balance. Use throws in the method declaration, invoke it from main(),
 and handle each exception separately. */
 
 import java.util.*;
 class Q3Throws
 {
	 
		static void withdraw(double bal,double amt) throws IllegalArgumentException
		{
			int total=bal-amt;
			System.out.println("Total "+total);
		}
		 
	 
	  public static void main(String x[])
	  {
		  Scanner xyz=new Scanner(System.in);
		  System.out.println("Enter Balance");
		  int bal=xyz.nextInt();
		  System.out.println("Enter withdraw amt");
		  int amt=xyz.nextInt();
		  try
		  {
			  withdraw(bal,amt);
		  }
		  catch(IllegalArgumentException e)
		  {
			  system.out.println(e);
		  }
	  }
 }