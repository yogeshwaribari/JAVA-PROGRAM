/*
Check whether a number is divisible by 5.
*/
import java.util.*;
class Divisible5
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int a = xyz.nextInt();
		String msg = ((a%5)==0) ? "Divisible by 5" : "Not Divisible by 5";
		System.out.println(msg);
	}
}