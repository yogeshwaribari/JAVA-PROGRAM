/*
Q4. Write a java program to find the frequency of each digit in a given number.
*/
import java.util.Scanner;
class Q4
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number value");
		int no = xyz.nextInt();
		
		
		for(int i=0;i<=9;i++)
		{
			int temp=no;
			int cnt=0;
			while(temp>0)
			{
				int d=temp%10; //seprate digit
				if(d==i)
				{
					cnt++; //count number
				}
				temp=temp/10; //remove last digit
			}
			if(cnt>0)
			{
				System.out.println(i+ " occurs " +cnt+ " times");
			}
		}
		
	}
	
}