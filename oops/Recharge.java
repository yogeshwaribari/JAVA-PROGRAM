/*Question 12: Write a Java program to implement a Mobile Recharge Plan Selector.
Create a class Recharge with attributes mobileNumber and planAmount.
Determine plan benefits:
- Plan 199 => 1GB/day
- Plan 399 => 2GB/day
- Plan 599 => 3GB/day
- Other => Invalid Plan
Input:
Enter Mobile Number : 9876543210
Enter Plan Amount : 399

Output:
Mobile Number : 9876543210
Plan : 399
Benefit : 2GB per day

Explanation:
A class Recharge is created with mobileNumber and planAmount.
User enters the mobile number and selects a recharge plan.
A switch-case or if-else block is used to match the plan:
- planAmount == 199 => 1GB per day
- planAmount == 399 => 2GB per day
- planAmount == 599 => 3GB per day
- default => Invalid Plan
Since planAmount = 399, the benefit is 2GB per day.
This program models a real telecom recharge system using class and conditional logic.
*/
import java.util.*;
class Recharge
{
	long number;
	int planAmount;
	
	void putData()
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number");
		number=xyz.nextLong();
		System.out.println("Enter Plan Amount");
		planAmount=xyz.nextInt();
	}
	void getData()
	{
		System.out.println("Number :"+number);
		System.out.println("Plan Amount :"+planAmount);
		if(planAmount==199)
		{System.out.println("Benefit : 1GB per day");
		}
		else if(planAmount==399)
		{
			System.out.println("Benefit : 2GB per day");
		}
		else if(planAmount==599)
		{
			System.out.println("Benefit : 3GB per day");
		}
		else{
			System.out.println("Invalid Plan");
		}
	}
	public static void main(String x[])
	{
		Recharge r= new Recharge();
		r.putData();
		r.getData();
	}
}