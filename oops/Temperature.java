/*Question 5: Write a Java program to implement a Temperature Checker.
Create a class Temperature with attribute temp.
Check the weather condition:
- temp > 35 => Hot
- temp 20 to 35 => Normal
- temp < 20 => Cold
Input:
Enter Temperature : 18

Output:
Temperature : 18
Weather : Cold

Explanation:
A class Temperature is created with an instance variable temp.
The user enters a temperature value via Scanner.
An if-else ladder checks the range:
- temp > 35 => Hot
- temp >= 20 && temp <= 35 => Normal
- temp < 20 => Cold
Since 18 < 20, the weather condition is Cold.
If temp = 30, it would print Normal. If temp = 40, it would print Hot.
This demonstrates multi-range conditional logic using class objects*/
import java.util.*;
class Temperature{
	int temp;
	
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Temperature");
		temp=xyz.nextInt();
	}
	
	void getData()
	{
		System.out.println("Temperature = "+temp);
		if(temp>35)
		{
			System.out.println("Weather = Hot");
		}
		else if(temp>=20 && temp<=35)
		{
			System.out.println("Weather = Normal");
		}
		else if(temp<20)
		{
			System.out.println("Weather = Cold");
		}
	
	}
	public static void main(String x[])
	{
		//Scanner xyz=new Scanner(System.in);
		Temperature tep=new Temperature();
		//System.out.println("Enter Temperature");
		tep.putData();
		
		tep.getData();
	}
}