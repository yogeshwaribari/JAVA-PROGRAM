/*
Question 42: Employee salary hike based on performance and years of service:
? Input: Basic salary, Years of service, Performance rating (1–5)
? Logic:
? If rating >= 4 and service > 5 yrs ? 20% hike
? Else if rating >= 3 ? 10%
? Else ? 5%
? Output: New salary.
Input
Basic Salary
Years of Service
Performance Rating (1–5)

Example Input:
Basic Salary = 30000
Years of Service = 6
Rating = 4

Logic
If rating ? 4 and service > 5 years ? 20% hike
Else if rating ? 3 ? 10% hike
Else ? 5% hike

Output
New Salary = 36000

Explanation
Since rating is 4 and service is more than 5 years, employee gets 20% hike.
20% of 30000 = 6000
New Salary = 30000 + 6000 = 36000
*/
import java.util.Scanner;
class SalaryHike
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		int s  = xyz.nextInt();
		System.out.println("Enter Years of Service");
		int y = xyz.nextInt();
		System.out.println("Enter Rating 1-5");
		int r = xyz.nextInt();
		int hike;
		if(r>=4 && y>5)
		{
			hike=(s*20)/100;
		}
		else if(r>=3)
		{
			hike=(s*10)/100;
		}
		else{
			hike=(s*5)/100;
		}
		int newsal = s + hike;
		System.out.println("New Salary = " +newsal);
		
	}
}