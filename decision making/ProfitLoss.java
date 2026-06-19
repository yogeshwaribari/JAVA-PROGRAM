/*
Question 7: Write a Java program to input cost price and selling price of a product and check profit or loss.
Input:
Cost Price = 500
Selling Price = 650

Output:
Profit

Explanation:
If SP > CP ? Profit
If SP < CP ? Loss
*/
import java.util.*;
class ProfitLoss
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Cost and Profit Price");
		
		int cp = xyz.nextInt();
		int sp = xyz.nextInt();
		if(sp>cp)
		{
			System.out.println("Profit");
		}
		else if (sp<cp)
		{
			System.out.println("Loss");
		}
			
		
	}
}