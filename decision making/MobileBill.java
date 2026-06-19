/*
Question 43: Mobile plan billing system:
? Input: Minutes used in a month
? Logic:
? Up to 100 mins ? Base ?199
? 101–300 mins ? ?199 + ?1/min for extra
? 301–500 mins ? ?199 + ?1.5/min for extra
? Above 500 mins ? ?199 + ?2/min for extra
? Output: Total monthly bill.
Input
Minutes Used = 350

Logic
Up to 100 mins ? ?199

101–300 mins ? ?199 + ?1 per extra minute

301–500 mins ? ?199 + ?1.5 per extra minute

Above 500 mins ? ?199 + ?2 per extra minute

Output
Total Bill = ?574

Explanation
Extra minutes = 350 ? 100 = 250
Since usage is in 301–500 range:
Extra charge = 250 × 1.5 = 375
Total Bill = 199 + 375 = 574
*/
import java.util.Scanner;
class MobileBill
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Minutes Used");
		int m = xyz.nextInt();
		int base = 199;
		double ex =0;
		if (m>0 && m<=100)
		{
			System.out.println("NO Extra Charge");
		}
		else if(m>=101 && m<=300)
		{
			m = m-100;
			ex = m*1;
		}
		else if(m>=301 && m<=500)
		{
			m = m-100;
			ex = m*1.5;
		}
		else if(m>500)
		{
			m = m-100;
			ex = m*2;
		}
		System.out.println("Total Bill = "+(base + ex));
	}
}