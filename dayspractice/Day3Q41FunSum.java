/*
41
Function to add two numbers
LC 2235
*/
import java.util.*;
class Day3Q41FunSum
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter values");
		int a=xyz.nextInt();
		int b=xyz.nextInt();
		int result=sum(a,b);
		System.out.println("Sum ="+result);
	}
	public static int sum(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	
}