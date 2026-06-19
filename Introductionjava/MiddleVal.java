/*Question 51: Write a Java program to find the middle value among three distinct integers using ternary operator.
Input:
p = 10
q = 20
r = 15

Output:
Middle Number = 15

Explanation:
The middle number is the value that lies between the other two numbers.
Here, 15 lies between 10 and 20.
*/

import java.util.*;
class MiddleVal
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter three number");
		
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		int c = xyz.nextInt();
	
		String msg = (((a>b && a<c)||(a<b && a>c)) ? "Middle NO=" +a : ((b>a && b<c)||(b<a && b>c)) ? "Middle NO=" +b : "Middle NO=" +c);
		System.out.println(msg);
	}
}