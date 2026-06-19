/*
Q.2 Write a Java program to reverse a number without using loop.
Input a number: 123
Reverse number: 321 
*/
import java.util.Scanner;
class Q2
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int rev =(no%10)*100+((no/10)%10)*10+(no/100);//separate number and add 300+20+1
		System.out.println("Reverse number ="+rev);
	}
}