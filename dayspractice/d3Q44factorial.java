/*
44.Function to calculate factorial
LC 172*/
import java.util.*;
class d3Q44factorial 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number");
		int no= xyz.nextInt();
		int result=factorial(no);
		System.out.println("Factorial ="+result);
		
	}
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}