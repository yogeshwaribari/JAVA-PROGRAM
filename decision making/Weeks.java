/*
Question 31: Write a java program to input week number(1-7) and print the corresponding day of week name 
using if else. How to print day of week using if else in java programming.
Input:
Week Number = 3
Output:
Wednesday

Explanation:
If week number is:
1 ? Monday
2 ? Tuesday
3 ? Wednesday
4 ? Thursday
5 ? Friday
6 ? Saturday
7 ? Sunday

If the input is not between 1–7, print Invalid Week Number.
*/
import java.util.Scanner;
class Weeks
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Week no");
		int w = xyz.nextInt();
		if(w==1)
		{
			System.out.println("Monday");
		}
		else if(w==2)
		{
			System.out.println("Tuesday");
		}
		else if(w==3)
		{
			System.out.println("Wednesday");
		}
		else if(w==4)
		{
			System.out.println("Thursday");
		}
		else if(w==5)
		{
			System.out.println("Friday");
		}
		else if(w==6)
		{
			System.out.println("Saturday");
		}
		else if(w==7)
		{
			System.out.println("Sunday");
		}
	}
}