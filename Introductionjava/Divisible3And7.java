/*
Check whether a number is divisible by 3 and 7.
*/
import java.util.*;
class Divisible3And7
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int a = xyz.nextInt();
		String msg = ((a%3)==0 && (a%7)==0) ? "Divisible by 3 and 7" : "Not Divisible by 3 and 7";
		System.out.println(msg);
	}
}