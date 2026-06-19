/*Question 31: Write a Java program to implement an Electricity Bill Generator using POJO class.
Create a POJO class Electricity with variables customerId and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit
Input:
Enter Customer Id : 501
Enter Units : 250

Output:
Customer Id : 501
Units : 250
Total Bill : Rs. 1850

Explanation:
A POJO class Electricity has private fields: customerId and units.
Setter methods store user input. Getter methods retrieve units for calculation.
Slab-based bill calculation:
- First 100 units : 100 * 5 = 500
- Next 100 units : 100 * 7 = 700
- Remaining units : (250 - 200) = 50 units * 13 = 650
- Total Bill = 500 + 700 + 650 = 1850
If-else conditions check if units > 200, units > 100 to apply slabs.
This program shows POJO with real-world tiered billing logic.*/
import java.util.*;
class Electricity
{
	private int customerId;
	private int units;
	
	public void setCustomerId(int customerId)
	{
		this.customerId=customerId;
	}
	public int getCustomerId()
	{
		return customerId;
	}
	public void setUnits(int units)
	{
		this.units=units;
	}
	public int getUnits()
	{
		return units;
	}
	
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter customer Id");
		setCustomerId(xyz.nextInt());
		System.out.println("Enter Units");
		setUnits(xyz.nextInt());
	}
	
	void Calunits()
	{
		System.out.println("Customer Id :"+getCustomerId());
		System.out.println("Units :"+getUnits());
		int bill=0;
		if(getUnits()<=100)
		{
			bill=getUnits()*5;
		}
		else if(getUnits()<=200)
		{
			bill=(100*5)+((getUnits()-100)*7);
		}
		else{
			bill=(100*5)+(100*7)+((getUnits()-200)*13);
		}
		System.out.println("Total Bill : Rs."+bill);
	}
}
class Q31POJOElectricity{
	public static void main(String x[])
	{
		Electricity e=new Electricity();
		e.putData();
		e.Calunits();
	}
}