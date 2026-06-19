/*
Question 38: Write a Java program to check whether a given year is a leap year or not.
Input:
Year = 2024

Output:
Leap Year

Explanation:
A leap year is divisible by 4.
However, if divisible by 100, it must also be divisible by 400 to be a leap year.
*/
import java.util.*;
class LeapYear
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Year");
		int y = xyz.nextInt();
		
		String msg = ((y%400==0) ? "Leap Year" : (y%100==0) ? "Not Leap Year" : (y%4==0) ? "Leap Year" : "Not Leap Year");
		System.out.println(msg);
	}
}