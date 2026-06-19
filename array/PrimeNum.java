/*
Question 37: Count the number of prime numbers in an array.
Input:
Array = [2, 5, 6, 9, 11]

Output:
Count of Prime Numbers = 3

Explanation:
Check each element to see if it is divisible only by 1 and itself and count such numbers.
*/
import java.util.Scanner;
class PrimeNum
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		int pricnt=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				pricnt++;
			}
			
		}
		System.out.print("Count of Prime Numbers = "+pricnt);
	}
}