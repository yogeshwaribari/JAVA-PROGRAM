/*
Question 41: Write a Java program to find the largest and smallest digit of a given number.
Explanation:
Use a while loop to extract digits, compare each digit to track max and min.
Input:
Number = 583902

Output:
Largest Digit = 9
Smallest Digit = 0

Explanation:
The program extracts each digit using a while loop.
Each digit is compared to track maximum and minimum values.
*/
import java.util.Scanner;
class LargestSmallestDigit
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = xyz.nextInt();
		
		int d;
		int min = 0;
		int max = 9;
			while(n>0)
			{
				 d = n%10;
				if(d>min)
				{
					min=d;
				}
				if(d<max)
				{
					max=d;
				}
				n=n/10;
			}
			
				System.out.println("Largest value = "+min);
			
				System.out.println("Smallest value = "+max);
			
		
	}
}