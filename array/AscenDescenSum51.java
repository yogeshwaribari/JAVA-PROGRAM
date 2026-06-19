/*
Question 51: Write a java program to take input array from user and perform all operations in array.
Input:
Array = [5732, 8659, 2534, 9625, 7354, 1325]

Output:
Ascending Digits = [2357, 5689, 2345, 2569, 3457, 1235]
Descending Digits = [7532, 9865, 5432, 9652, 7543, 5321]
Sum of Digits = [17, 28, 14, 22, 19, 11]

Explanation:
Each number is processed by sorting its digits in ascending or descending order and also by 
calculating the sum of its digits.
*/
import java.util.Scanner;
class AscenDescenSum51
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("ascending order");
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			int temp=num;
			int d[]=new int[10];
			int cnt=0;
			int sum=0;
			while(temp>0)
			{
				d[cnt]=temp%10;
				sum=sum+d[cnt];
				temp=temp/10;
				cnt++;
			}
			for(int j=0;j<cnt;j++)
			{
				for(int k=j+1;k<cnt;k++)
				{
					if(d[j]>d[k])
					{
						int t = d[j];
						d[j]=d[k];
						d[k]=t;
					}
				}
				
				 
			}
			int as=0;
			for(int j=0;j<cnt;j++)
			{
				as=as*10+d[j];
			}
			System.out.print(" "+as);
			
		}
		
		System.out.println("Sum of Digit");
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int sum=0;
			while(temp>0)
			{
				sum=sum+(temp%10);
				temp=temp/10;
			}
			System.out.print(" "+sum);
		}
	}
}

