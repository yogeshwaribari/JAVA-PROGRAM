/*
Q3. Write a java program to display 1 to nth Armstrong Number.
*/
import java.util.Scanner;
class Q3
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter nth value");
		int n = xyz.nextInt();
		int cnt = 0;
		
		for(int i=0;cnt<n;i++)
		{
			int temp=i;
			int sum = 0;
			int f=0;
			while(temp>0)
			{
				int d=temp%10;    //seprate digit
				f=d*d*d;		 //cal cube
				sum=sum+f; 		//addition after cube
				temp=temp/10;  //del last digit
			}
			if(sum==i) 
			{
				System.out.println(i+" ");
				cnt++;
			}	
		}
	}
}