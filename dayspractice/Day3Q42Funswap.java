/*
42.Function to swap two numbers
*/
import java.util.*;
class Day3Q42Funswap
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter values");
		int a=xyz.nextInt();
		int b=xyz.nextInt();
		swap(a,b);
		
	}
	public static void swap(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
