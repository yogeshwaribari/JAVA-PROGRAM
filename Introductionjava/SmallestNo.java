/*
Find the ( number among three numbers.
*/

import java.util.*;

class SmallestNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		System.out.println("Smallest no =" + ((a<b) ? a : b));
		
	}
} 