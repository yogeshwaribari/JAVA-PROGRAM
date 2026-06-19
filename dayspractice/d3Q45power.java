/*
45.Function to calculate power
LC 50*/
import java.util.*;
class d3Q45power
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter base and power");
		int b=xyz.nextInt();
		int p=xyz.nextInt();
		int result=power(b,p);
		System.out.println("result "+result);
		
	}
	public static int power(int base,int pow)
	{
		int po=1;
		for(int i=1;i<=pow;i++)
		{
			po=po*base;
		}
		return po;
	}
}