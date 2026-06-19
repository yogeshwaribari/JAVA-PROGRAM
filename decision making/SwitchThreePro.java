/*
Question 63: Write a menu-driven program in java using switch case.
          1.Check Number is positive , negative or zero.
          2.Check Number is even or odd.
          3.Write a c program to find the max number using 2 numbers.
Input:
Choice = 1
Number = -5

Output:
Negative Number

Explanation:
Program checks if number is less than zero and prints Negative.

Input:
Choice = 3
Number1 = 10
Number2 = 20

Output:
Maximum Number = 20

Explanation:
Program compares two numbers and prints the greater one.
*/
import java.util.Scanner;
class SwitchThreePro
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("1.check positive & negative \n2.even or odd \n3.Max number \nEnter Your Choice");
		int c = xyz.nextInt();
		switch(c)
		{
			case 1 :
			System.out.println("Enter a Number");
			int n = xyz.nextInt();
			if(n>0)
			{
				System.out.println("Positive Number");
			}
			else if(n==0)
			{
				System.out.println("Zero");
			}
			else{
				System.out.println("Negative Number");
			}
			break;
			case 2:
			System.out.println("Enter a Number");
			int no = xyz.nextInt();
			if(no%2==0)
			{
				System.out.println("Even");
			}
			else{
				System.out.println("Odd");
			}
			break;
			case 3:
			System.out.println("Enter two numbers");
			int n1 = xyz.nextInt();
			int n2 = xyz.nextInt();
			if(n1>n2)
			{
				System.out.println("Maximum Number = "+n1);
			}
			else{
				System.out.println("Maximum Number = "+n2);
			}
			break;
			default : System.out.println("Invalid Choice");
			break;
		}
	}
}