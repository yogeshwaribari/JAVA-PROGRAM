/*
Question 55: Develop a Java program using switch to print the day type for an input day number (1-7):
? 1 for Monday, …, 7 for Sunday.
? For 1-5, display “Weekday”; for 6-7, display “Weekend”.
Input:
Day = 3

Output:
Weekday

Explanation:
Day numbers 1 to 5 represent Monday to Friday, so they are weekdays.

Input:
Day = 7

Output:
Weekend

Explanation:
Day numbers 6 and 7 represent Saturday and Sunday, which are weekends.
*/
import java.util.Scanner;
class WeekSwitch
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Week Day");
		int d = xyz.nextInt();
		switch(d)
		{
			case 1 : 
			case 2 :
			case 3 :
			case 4 :
			case 5:
			System.out.println("Weekdays");
			break;
			case 6:
			case 7 :
			System.out.println("Weekends");
			break;
			default : System.out.println("Invalid days");
			break;
		}
	}
}