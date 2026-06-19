/*Question 15: Write a Java program to implement a Parking Fee Calculator.
Create a class Parking with attributes vehicleNumber and hours.
Calculate parking fee:
- First 2 hours => Rs.20 per hour
- Remaining hours => Rs.30 per hour
Display total fee.
Input:
Enter Vehicle Number : MH12AB1234
Enter Hours : 5

Output:
Vehicle Number : MH12AB1234
Parking Hours : 5
Total Parking Fee : Rs. 130

Explanation:
A class Parking is created with vehicleNumber and hours.
The fee calculation uses a slab system:
- For the first 2 hours: 2 * 20 = 40
- Remaining hours: (5 - 2) = 3 hours * 30 = 90
- Total Fee = 40 + 90 = 130
Condition: if (hours > 2), charge Rs.30 per hour for extra time.
If hours = 2, total fee = 2 * 20 = 40 (no extra charge).
This program models a real parking system using class objects and tiered pricing.
*/
import java.util.*;
class Parking
{
	String vehicleNumber;
	int hours;
	
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Vehicle Number");
		vehicleNumber=xyz.nextLine();
		System.out.println("Enter Hours");
		 hours=xyz.nextInt();
	}
	void getData()
	{
		System.out.println("Vehicle Number : "+vehicleNumber);
		System.out.println("Parking Hours : "+hours);
		int fee=0;
		if(hours<=2)
		{
			fee= hours*20;
		}
		else
		{
			fee=40+(hours-2)*30;
		}
		System.out.println("Total Parking Fee : Rs. "+fee);
	}
	public static void main(String x[])
	{
		Parking p=new Parking();
		p.putData();
		p.getData();
	}
}