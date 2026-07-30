/*Question 41: Create a base class Plan with attribute planName.
Create a child class Prepaid that adds rechargeAmount.
Create another child class Postpaid that adds billAmount.

Use constructor chaining (super()).
Store 2 plans using array and display details.
Asked In Practice Assignment
Description
Models a telecom system (prepaid vs postpaid).
Input
Enter number of Plans: 2

Enter Plan: Basic
Enter Recharge: 199
Enter Bill: 0

Enter Plan: Premium
Enter Recharge: 0
Enter Bill: 999
Output
Plan: Basic, Recharge: 199
Plan: Premium, Bill: 999*/
import java.util.*;
class Plan{
	String planName;
	Plan(String planName)
	{
		this.planName=planName;
	}
	void display()
	{
		
	}
}
class Prepaid extends Plan
{
	int rechargeAmount;
	Prepaid(String planName,int rechargeAmount)
	{
		super(planName);
		this.rechargeAmount=rechargeAmount;
	}
	void display()
	{
		System.out.println("Plan :"+planName+", recharge :"+rechargeAmount);
	}
}
class Postpaid extends Plan{
	int billAmount;
	Postpaid(String planName,int billAmount)
	{
		super(planName);
		this.billAmount=billAmount;
	}
	void display()
	{
		System.out.println("Plan :"+planName+", bill :"+billAmount);
	}
}
class Q41Plan
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of recharge");
		int n=xyz.nextInt();
		Plan p[]=new Plan[n];
		
		
		for(int i=0;i<n;i++)
		{
			xyz.nextLine();
			System.out.println("Enter your planName");
		String planName=xyz.nextLine();
		System.out.println("Enter recharge");
			int rechargeAmount=xyz.nextInt();
			System.out.println("Enter Bill Amount");
			int billAmount=xyz.nextInt();
			
			if(rechargeAmount>0)
			{
				p[i]=new Prepaid(planName,rechargeAmount);
			}
			else{
				p[i]=new Postpaid(planName,billAmount);
			}
		}
		for(int i=0;i<n;i++)
		{
			p[i].display();
		}
	}
}