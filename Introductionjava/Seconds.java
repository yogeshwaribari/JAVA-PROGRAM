/*
Question 17: Write a Java program to convert seconds into hours, minutes, and seconds.
Input:
Seconds = 3665

Output:
Hours = 1
Minutes = 1
Seconds = 5

Explanation:
1 hour = 3600 seconds.
3665 ÷ 3600 gives 1 hour.
Remaining seconds are converted into minutes and seconds using division and modulus operations.
*/

import java.util.*;

class Seconds
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Seconds");
		
		int Seconds = xyz.nextInt();
		int Hours = Seconds/3600;
		int rem = Seconds%3600;
		int Minutes = rem/60;
		Seconds = rem%60;
		
		System.out.println("Hours = " + Hours + "\nMinutes =" + Minutes + "\nSeconds =" + Seconds);
		
		
		
	}
}