/*Question 34: Write a Java program to implement a Parking Fee Calculator using POJO class.
Create a POJO class Parking with variables vehicleNumber and hours.
Calculate parking fee:
- First 2 hours => Rs.20 per hour
- Remaining hours => Rs.30 per hour
Input:
Enter Vehicle Number : 1234
Enter Hours : 5

Output:
Vehicle Number : 1234
Parking Fee : Rs. 130

Explanation:
A POJO class Parking has private fields: vehicleNumber and hours.
Setter methods store user input. Getter methods retrieve hours for fee calculation.
Fee logic:
- First 2 hours: 2 * 20 = 40
- Remaining: (5 - 2) = 3 hours * 30 = 90
- Total Fee = 40 + 90 = 130
Condition: if (hours > 2) add (hours - 2) * 30 to the base fee of 40.
If hours = 2, total = 40. If hours = 1, total = 1 * 20 = 20.
This demonstrates POJO with tiered fee calculation logic.*/
import java.util.*;
class Parking
{
	private int vehicleNumber;
	private int hours;
	
	public void setVehicalNumber(int vehicleNumber)
	{
		this.vehicleNumber=vehicleNumber;
	}
	public int getVehicalNumber()
	{
		return vehicleNumber;
	}
	public void setHours(int hours)
	{
		this.hours=hours;
	}
	public int getHours()
	{
		return hours;
	}
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter vehicle Number");
		setVehicalNumber(xyz.nextInt());
		System.out.println("Enter Hours");
		setHours(xyz.nextInt());
	}
	void getData()
	{
		int fee=0;
		System.out.println("Vehicle Number : "+getVehicalNumber());
		if(getHours()<=2)
		{
			fee=getHours()*20;
		}
		else
		{
			fee=40+(getHours()-2)*30;
		}
		System.out.println("Parking fee : Rs."+fee);
		
	}

}
class Q34POJOparking
{
	public static void main(String x[])
	{
		Parking p=new Parking();
		p.putData();
		p.getData();
	}
}