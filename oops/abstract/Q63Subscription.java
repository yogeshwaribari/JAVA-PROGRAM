/*Question 63: Create abstract class Subscription.
Asked In Practice Question
Abstract method getPlan().
Subclasses:

Basic

Premium

Input
Type: Premium
Output
Premium Plan Activated*/
import java.util.*;
abstract class Subscription
{
	abstract void getPlan();
}
class Basic extends Subscription
{
	void getPlan()
	{
		System.out.println("Basic Plan Activated");
	}
}
class Premium extends Subscription
{
	void getPlan()
	{
		System.out.println("Premium Plan Activated");
	}
}
class Q63Subscription
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.Basic Plan\n2.Premium Plan");
		System.out.println("Enter your choice");
		int n=xyz.nextInt();
		Subscription s;
		switch(n)
		{
			case 1:
			s=new Basic();
			s.getPlan();
			break;
			case 2:
			s=new Premium();
			s.getPlan();
			break;
			default:
			System.out.println("Wrong choice");
		}
	}
}