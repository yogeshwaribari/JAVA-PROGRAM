/*
Question 55: Write a Java program to determine bonus based on performance rating.
Input:
Rating = 9

Output:
15% Bonus

Explanation:
If rating > 8 ? 15% bonus
If rating between 5 and 8 ? 10% bonus
Otherwise ? No bonus
Since rating is 9, employee gets 15% bonus.
*/
import java.util.*;
class Rating
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Rating");
		
		int r = xyz.nextInt();
		String msg = ((r > 8) ? "15% bonus" : (r>=5 && r<=8) ? "10% bonus" : "No bonus");
		System.out.println(msg);
	}
}