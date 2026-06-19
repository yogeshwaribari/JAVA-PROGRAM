/*
Question 37: Compare two numbers: greater, smaller, or equal.

   Input: Two integers
   Logic: if-else if
   Output: Greater, smaller, or equal.
Input:
A = 25
B = 30
Output:
A is smaller than B
Explanation:
Use if-else to compare values.
*/
import java.util.Scanner;
class CompareNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = xyz.nextInt();
		int b = xyz.nextInt();
		if(a>b)
		{
			System.out.println("A is Grater than B");
		}
		else if(a==b){
			System.out.println("Equal No");
		}
		else
		{
			System.out.println("A is Smaller than B");
		}
		
	}
	
}