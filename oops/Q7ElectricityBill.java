/*Question 7: Write a Java program to implement an Electricity Bill Calculator.
Create a class ElectricityBill with attributes customerId, name, and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit
Display total bill.
Input:
Enter Customer Id : 301
Enter Name : Suresh
Enter Units : 250

Output:
Customer Id : 301
Name : Suresh
Units : 250
Total Bill : Rs. 1850

Explanation:
A class ElectricityBill is created with customerId, name, and units.
Bill is calculated in slabs:
- First 100 units : 100 * 5 = 500
- Next 100 units : 100 * 7 = 700
- Remaining units : (250 - 200) = 50 units * 13 = 650
- Total Bill = 500 + 700 + 650 = 1850
The if-else conditions check: if units > 200, add slabs progressively.
This program demonstrates tiered calculation logic with class objects.

Asked In Companies:
Practice assignment
*/
import java.util.*;
class Q7ElectricityBill
{
	int custId;
	String name;
	int units;
	
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Customer Id");
		custId=xyz.nextInt();
		xyz.nextLine();
		System.out.println("Enter Name");
		name=xyz.nextLine();
		System.out.println("Enter Units");
		units=xyz.nextInt();
	}
	void getData()
	{
		System.out.println("Customer Id ="+custId);
		System.out.println("Name ="+name);
		System.out.println("Units ="+units);
		int tbill=0;
		if(units<=100)
		{
			tbill=units*5;
		}
		else if(units<=200)
		{
			tbill=(100*5)+((units-100)*7);
		}
		else{
			tbill=(100*5)+(100*7)+((units-200)*13);
		}
		System.out.println("Total bill = Rs."+tbill);
		
	}
	public static void main(String x[])
	{
		Q7ElectricityBill e=new Q7ElectricityBill();
		e.putData();
		e.getData();
		
	}
}