/*
Question 31: Write a java program to display 1 to nth Duck Number.
Input:

n = 5

Output:

10 20 30 40 50

Explanation:

Duck numbers contain zero inside the number.
The first five Duck Numbers are 10, 20, 30, 40, and 50.
*/
import java.util.Scanner;
class NDuck
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a value");
		int no = xyz.nextInt();
		int cnt =0;
		int d;
		boolean flag = false;
		for(int j=1;cnt<no;j++)
		{
		
			for(int i=1; i>0;i++)
			{
				d=i%10;
				if(d==0)
				{
					flag=true;
					break;
				}
			}
			if(flag)
			{
				System.out.println(j+" ");
				cnt++;
			}
				
		}
	}
}