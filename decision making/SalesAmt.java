/*
Question 40: Calculate commission based on sales amount:
? Input: Sales amount
? Logic:
? Sales < 5000 ? 2% commission
? Sales 5000–10000 ? 5% commission
? Sales > 10000 ? 10% commission
? Output: Display commission amount.
Input:
Sales = 12000

Output:
Commission = 1200

Explanation:

Sales < 5000 ? 2%
5000–10000 ? 5%
10000 ? 10%
12000 × 10% = 1200
*/
import java.util.Scanner;
class SalesAmt
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Sales");
		int s= xyz.nextInt();
		if(s < 5000)
		{
			s = (s*2)/100;
		}
		else if(s>=5000 && s<10000)
		{
			s= (s*5)/100;
		}
		else if(s>=10000)
		{
			s = (s*10)/100;
		}
		System.out.println("commission = " +s);
		
	}
}