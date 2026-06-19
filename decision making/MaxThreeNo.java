/*
Question 11: Write a java program to find a maximum between three numbers.
Input:
Number1 = 25
Number2 = 40
Number3 = 32

Output
Maximum number = 40

Explanation:
The program compares all three numbers using conditional statements.
If Number1 is greater than Number2 and Number3, then it is maximum.
Otherwise, compare Number2 and Number3 to find the largest value.
*/
import java.util.*;
class MaxThreeNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		int num1 = xyz.nextInt();
		int num2 = xyz.nextInt();
		int num3 = xyz.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("Maximum number = "+num1);
		}
		else if(num2>num3)
		{
			System.out.println("Maximum number = "+num2);
		}
		else{
			System.out.println("Maximum number = "+num3);
		}
	}
}