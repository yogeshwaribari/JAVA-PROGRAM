/*
Question 10: Write a java program to count the number of digits in a number
Input:

Number = 12345

Output:

Number of digits = 5

Explanation:

The program divides the number by 10 repeatedly until it becomes 0.
Each division reduces one digit, and a counter keeps track of total digits.
*/
import java.util.Scanner;
class CountNumber
{
	public static void main(String x[])
	{
	Scanner xyz = new Scanner(System.in);
	System.out.println("Enter a Number");
	int no = xyz.nextInt();
	int count =0;
	while(no>0)
	{
		no = no/10;
		count++;	
	}
	System.out.println("Numbers of digit ="+count);
	}
}