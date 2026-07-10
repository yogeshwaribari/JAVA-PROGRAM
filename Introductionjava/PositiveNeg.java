/*
Check whether a number is positive, negative, or zero.
*/
import java.util.*;
class PositiveNeg
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		int a = xyz.nextInt();
		String msg = (a>0) ? "Positive" : (a==0) ? "Zero" : "Negative";
		System.out.println(msg);
	}
}