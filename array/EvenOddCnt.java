/*
Question 5: Write a Java program to count even & odd values from an array.
Input:
Array Size = 7
Array Elements = 12 17 24 39 40 55 70
Output:
Count of Even Values = 4
Count of Odd Values = 3
Explanation:
? Initialize counters: evenCount = 0, oddCount = 0.
? For each element in the array:

? If divisible by 2 ? increase evenCount.
? Otherwise ? increase oddCount.

? Final counts are displayed.
*/
import java.util.Scanner;
class EvenOddCnt
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter array Size");
		int index = xyz.nextInt();
		int a[] = new int[index];
		int ecnt =0;
		int ocnt=0;
		System.out.println("Enter array elements");
		for(int i=0;i<index;i++)
		{
			a[i]=xyz.nextInt();
		}
		for(int i=0;i<index;i++)
		{
			if(a[i]%2==0)
			{
				ecnt++;
			}
		}
		System.out.println("Count of Even Number = "+ecnt);
		
		for(int i=0;i<index;i++)
		{
			if(a[i]%2!=0)
			{
				ocnt++;
			}
		}
		System.out.println("Count of Odd Number = "+ocnt);
	}
}