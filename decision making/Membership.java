/*
Question 44: Calculate fine for library book return:
? Input: Number of days late
? Logic:
? Up to 5 days ? ?2/day
? 6–10 days ? ?3/day
? 11–30 days ? ?5/day
? More than 30 days ? Membership canceled + ?500 fine
? Output: Total fine + membership status.
Input
Days Late = 12

Logic
Up to 5 days ? ?2 per day
6–10 days ? ?3 per day
11–30 days ? ?5 per day
More than 30 days ? ?500 fine + Membership canceled

Output
Total Fine = ?60
Membership Status = Active

Explanation
12 days falls in 11–30 range.
Fine = 12 × 5 = 60
*/
import java.util.Scanner;
class Membership
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Days Late");
		int d = xyz.nextInt();
		if(d>=0 && d<=5)
		{
			d = d*2;
			System.out.println("Fine = " +d+ "\nMembership Status = Active");
			
		}
		else if(d>=6 && d<=10)
		{
			d = d*3;
			System.out.println("Fine = " +d+ "\nMembership Status = Active");
		}
		else if(d>=11 && d<=30)
		{
			d = d*5;
			System.out.println("Fine = " +d+ "\nMembership Status = Active");
		}
		else{
			
			System.out.println("Fine = 500 \nMembership Status = canceled");
		}
	}
}