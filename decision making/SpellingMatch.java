/*
Question 57: Create a Java program using switch to convert a given number (1-5) to its word equivalent 
(One, Two, ..., Five). If the number is not between 1 and 5, display “Invalid number”.
Input:
Number = 3

Output:
Three

Explanation:
Switch case 3 matches and prints “Three”. Default handles invalid numbers.

Input:
Number = 9

Output:
Invalid Number
Explanation:
Since 9 is outside 1–5, default case runs.
*/
import java.util.Scanner;
class SpellingMatch
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number 1-5");
		int n = xyz.nextInt();
		switch(n)
		{
			case 1 : System.out.println("One");
			break;
			case 2: System.out.println("Two");
			break;
			case 3 : System.out.println("Three");
			break;
			case 4 : System.out.println("Four");
			break;
			case 5 : System.out.println("Five");
			break;
			default:System.out.println("Invalid Number");
			break;
		}
	}
}