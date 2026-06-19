/*
Q1. Write a program to check whether a number is divisible by 5 and 11 yes or not, using
conditional & ternary operators. 
*/
import java.util.Scanner;
class Q1
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		//check condition divisible or not
		String msg = ((no%5==0 && no%11==0)? "divisible by 5 and 11" : "Not divisible by 5 and 11");
		System.out.println(msg); //result
	}
}