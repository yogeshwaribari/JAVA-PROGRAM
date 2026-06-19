/*46.Function to find GCD*/
import java.util.*;
class d3Q46GCD
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=xyz.nextInt();
		int n2=xyz.nextInt();
		int result=gcd(n1,n2);
		System.out.println("Result ="+result);
	}
	public static int gcd(int no1,int no2)
	{
		int gcd=1;
		for(int i=1;i<=no1 && i<=no2;i++)
		{
			if(no1%i==0 && no2%i==0)
			{
				gcd=i;
			}
		}
		return gcd;
	}
}