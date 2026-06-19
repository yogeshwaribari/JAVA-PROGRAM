/*
Q3. Write a java program to Check Number Is Spy Number or Not without using loop. 
*/
import java.util.Scanner;
class Q3
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number");
		int no = xyz.nextInt();
		int d1 = no/1000; //1
		int d2 = (no%1000)/100;//4
		int d3 = no/1000;//1
		int d4 = no%10;//2
		int sum = d1+d2+d3+d4;//1+4+1+2 =8
		int product = d1*d2*d3*d4;//1*4*1*2 = 8
		if(sum==product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not Spy Number");
		}
	}
}