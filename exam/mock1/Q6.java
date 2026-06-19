/*
Q6. Calculate commission based on sales amount:
• Input: Sales amount
• Logic:
o Sales < 5000 → 2% commission
o Sales 5000–10000 → 5% commission
o Sales > 10000 → 10% commission
• Output: Display commission amount.
*/
import java.util.Scanner;
class Q6
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Sales Amount");
		int amt = xyz.nextInt();
		if(amt<5000)
		{
			amt = (amt*2)/100; //2% commission
		}
		else if(amt>=5000 && amt<=10000)
		{
			amt = (amt*5)/100; //5% commission
		}
		else 
		{
			amt = (amt*10)/100; //10% commission
		}
		System.out.println("commission Amount = "+amt);
	}
}