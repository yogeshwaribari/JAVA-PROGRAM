/*Question 37: Create a base class Media with attribute platformName.
Create a child class Subscription that adds baseCost.
Create another child class OTTSubscription that adds addonCost.

Use this keyword and constructor chaining.
Store 2 subscriptions using array and calculate total cost.
Asked In Practice Assignment
Description
Shows OTT subscription model using this keyword and chaining.
Input
Enter number of Subscriptions: 2

Enter Platform: Netflix
Enter Base Cost: 500
Enter Addon Cost: 200

Enter Platform: Hotstar
Enter Base Cost: 400
Enter Addon Cost: 100
Output
Platform: Netflix, Total Cost: 700
Platform: Hotstar, Total Cost: 500*/
import java.util.*;
class Media
{
	String platformName;
	Media(String platformName)
	{
		this.platformName=platformName;
	}
}
class Subscription extends Media
{
	int baseCost;
	Subscription(String platformName,int baseCost)
	{
		super(platformName);
		this.baseCost=baseCost;
	}
} 
class OTTSubscription extends Subscription
{
	int addonCost;
	OTTSubscription(String platformName,int baseCost,int addonCost)
	{
		super(platformName,baseCost);
		this.addonCost=addonCost;
	}
	void display()
	{
		int total=baseCost+addonCost;
		System.out.println("Platform :"+platformName+", Total Cost :"+total);
	}
}
class Q37Media
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number of subscriptions");
		int n=xyz.nextInt();
		OTTSubscription o[]=new OTTSubscription[n];
		for(int i=0;i<n;i++)
		{
			xyz.nextLine();
			System.out.println("Enter platform Name");
			String platformName=xyz.nextLine();
			System.out.println("Enter base Cost");
			int baseCost=xyz.nextInt();
			System.out.println("Enter addon Cost");
			int addonCost=xyz.nextInt();
			o[i]=new OTTSubscription(platformName,baseCost,addonCost);
		}
		for(int i=0;i<n;i++)
		{
			o[i].display();
		}
	}
}