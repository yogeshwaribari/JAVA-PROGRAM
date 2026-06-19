/*
Question 38: Check whether the month number is valid and display season.

   Input: 1 to 12
   Logic: if-else if to map to Winter/Spring/Summer/Autumn.
   Output: Season.
Input:
Month Number = 4
Output:
Season: Spring

Explanation:
The program checks the month number and maps it to a season as follows:
December (12), January (1), February (2) ? Winter
March (3), April (4), May (5) ? Spring
June (6), July (7), August (8) ? Summer
September (9), October (10), November (11) ? Autumn
*/
import java.util.Scanner;
class Season
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Month Number");
		int m=xyz.nextInt();
		if(m==12 || m==1 || m==2)
		{
			System.out.println("Season: Winter");
		}
		else if(m==3 || m==4 || m==5 )
		{
			System.out.println("Season: Spring");
		}
		else if(m==6 || m==7 || m==8 )
		{
			System.out.println("Season: Summer");
		}
		else if(m==9 || m==10 || m==11)
		{
			System.out.println("Season: Antumn");
		}
	}
}