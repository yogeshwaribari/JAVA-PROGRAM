/*
Question 11: Write a java program to calculate the sum of digits in a number.
Input:

Number = 1234

Output:

Sum of digits = 10

Explanation:

The program separates each digit using modulus (%) and division (/).
Digits are 1, 2, 3, 4 and their sum is 1 + 2 + 3 + 4 = 10.
*/
import java.util.Scanner;
class SumDigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int sum = 0;
		while(no>0){
			int d = no%10;
		sum = sum+d;
		no=no/10;
		}
		System.out.println("Sum =" +sum);
		
	}
}