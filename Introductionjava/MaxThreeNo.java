/*
Question 41: Write a Java program to find the maximum among three numbers.
Input:
A = 10
B = 25
C = 15

Output:
Maximum = 25

Explanation:
The program compares all three numbers using conditional statements and prints the largest value.
*/
import java.util.*;
class MaxThreeNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		int c = xyz.nextInt();
		String msg = ((a>b && a>c) ? "Maximum =" +a : (b>a && b>c) ? "Maximum =" +b : "Maximum =" +c);
		System.out.println(msg);
	}
}