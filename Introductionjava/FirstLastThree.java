/*
Question 53: Write a Java program to print the larger digit between first and last digit of a three-digit number.
Input:
Number = 582

Output:
Larger Digit = 5

Explanation:
First digit = 5
Last digit = 2
Since 5 > 2, the larger digit is 5.
*/
import java.util.*;
class FirstLastThree
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int no= xyz.nextInt();
		int first = no/100;
		int last = no%10;
		System.out.println((first > last) ? "Larger digit is " + first : "Larger digit is " + last);
		
	}
}