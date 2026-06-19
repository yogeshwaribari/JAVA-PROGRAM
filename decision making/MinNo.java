/*
Question 15: Write a java program to find the minimum between two numbers.
Input:
Number1 = 8
Number2 = 12

Output
Minimum number = 8

Explanation:
Compare both numbers using if-else.
The smaller value is printed as minimum.
*/
import java.util.*;
class MinNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		if(a<b)
		{
			System.out.println("Minimum number =" +a);
		}
		else{
			System.out.println("Minimum number =" +b);
		}
	}
	
	
}