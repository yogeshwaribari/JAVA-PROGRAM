/*
Q7. Write a java program to take input array from user and perform operations in array.
Input Array : 5732 8659 2534 9625 7354 1325
Output :- 17 28 14 22 19 11
*/
import java.util.Scanner;
class Q7
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int [6];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int sum =0;
				while(a[i]>0)
				{
					int d = temp%10;
					sum=sum+d;
				
					temp=temp/10;
					
				}	
				a[i]=sum;
				
		}
			
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}