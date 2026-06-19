/*
Question 34: Write a java program to find the frequency of each digit in a given integer.
Input:
Number = 112233

Output:
1 occurs 2 times
2 occurs 2 times
3 occurs 2 times

Explanation:
The program counts how many times each digit appears in the number.
Each digit is extracted and its count is increase
*/
import java.util.Scanner;
class DigitCnt
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number value");
		int no = xyz.nextInt();
		for(int j=0;j<=9;j++)
		{
			int temp=no;
			int cnt=0;
			while(temp>0)
			{
				int d=temp%10;
				if(d==j)
				{
					cnt++;
				}
				temp=temp/10;
			}
			if(cnt>0)
			{
				System.out.println(j+ " occurs " +cnt+ " times");
			}
		}
	}
}