/*43,Function to check prime number
LC 204*/

import java.util.*;
class d3Q43Prime
{
	public static void prime(int n)
	{
		
		int cnt=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			cnt++;
			}
		}
		if(cnt==2)
		{
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("Not prime no");
		}
	}
public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		   int no=xyz.nextInt();
		prime(no);
	}
		
	
}