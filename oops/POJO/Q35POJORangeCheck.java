/*Question 35: Write a Java program to implement a Number Range Analyzer using POJO class.
Create a POJO class RangeCheck with variable number.
Using getter and setter methods, determine:
- number < 0 => Negative
- number 0 to 100 => Normal Range
- number > 100 => Large Number
Input:
Enter Number : 135

Output:
Number : 135
Category : Large Number

Explanation:
A POJO class RangeCheck
{
} has private field: number.
setNumber(135) stores the value. getNumber() retrieves it for checking.
If-else ladder:
- number < 0 => Negative
- number >= 0 && number <= 100 => Normal Range
- number > 100 => Large Number
Since 135 > 100, Category = Large Number.
If number = -5, output would be Negative.
If number = 50, output would be Normal Range.
This demonstrates range checking logic using POJO encapsulation.*/
import java.util.*;
class RangeCheck
{
	private int number;
	
	public void setNumber(int number)
	{
		this.number=number;
	}
	public int getNumber()
	{
		return number;
	}
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number");
		setNumber(xyz.nextInt());
	}
	void getData()
	{
		System.out.println("Number :"+getNumber());
		if(getNumber()<0)
		{
			System.out.println("Category : Negative");
		}
		else if(getNumber()>=0 && getNumber()<=100)
		{
			System.out.println("Category : Normal Range");
		}
		else{
			System.out.println("Category : Large Number");
		}
	}
}
class Q35POJORangeCheck
{
	public static void main(String x[])
	{
		RangeCheck r=new RangeCheck();
		r.putData();
		r.getData();
	}
}