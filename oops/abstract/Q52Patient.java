/*Question 52: Create abstract class Patient.
Asked In Practice Question
Abstract method calculateBill().
Subclasses:

InPatient

OutPatient

Input
Type: InPatient
Days: 3
Rate: 2000
Output
Total Bill: 6000*/
import java.util.*;
abstract class Patient
{
	abstract void calculateBill();
}
class InPatient extends Patient
{
	int days;
	int rate;
	InPatient(int days,int rate)
	{
		this.days=days;
		this.rate=rate;
	}
	void calculateBill()
	{
		int totalbill=days*rate;
		System.out.println("Total Bill :"+totalbill);
	}
}
class OutPatient extends Patient
{
	int consulationfee;
	OutPatient(int consulationfee)
	{
		this.consulationfee=consulationfee;
	}
	void calculateBill()
	{
		System.out.println("Total Bill :"+consulationfee);
	}
}
class Q52Patient
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("1.InPatient");
		System.out.println("2.OutPatient");
		System.out.println("Enter choice");
		int choice=xyz.nextInt();
		Patient p;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Days");
			int days=xyz.nextInt();
			System.out.println("Enter rate");
			int rate=xyz.nextInt();
			p=new InPatient(days,rate);
			p.calculateBill();
			break;
			
			case 2:
			System.out.println("Enter consulation fee");
			int consulation=xyz.nextInt();
			p=new OutPatient(consulation);
			p.calculateBill();
			break;
			
			default :
			System.out.println("Wrong choice");
		}
	}
}