/*
Question 50: Write a java program to find unique value in this given array.
Input:
Array = [1, 2, 3, 5, 1, 5, 20, 2, 12, 10]

Output:
Unique Elements = [3, 20, 12, 10]

Explanation:
Count occurrences of each element and print those elements that appear exactly once.
*/
import java.util.Scanner;
class UniqueVal50
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Unique elements");
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
				}
			}
		
				if(cnt==1)
				{
					System.out.print(" "+a[i]);
				}
		}
	}
	
}