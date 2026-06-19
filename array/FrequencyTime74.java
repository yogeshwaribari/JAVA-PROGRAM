/*
Question 74: Count Frequency of Each Element (Without Hashing)
Description:
Given an array, count how many times each element appears using nested loops (no HashMap allowed).
Input:
n = 5
Array = [1, 2, 2, 3, 1]

Output:
1 ? 2 times
2 ? 2 times
3 ? 1 time

Explanation:
For each element:
Loop through entire array again.
Count matches.
Outer loop runs n times.
Inner loop runs n times.

Time Complexity: O(n²)
Because every element is compared with every other element.
*/
import java.util.Scanner;
class FrequencyTime74
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=xyz.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			a[i]=xyz.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			
			boolean flag=false;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
				{
					int cnt=1;
					for(int j=i+1;j<n;j++)
					{
						if(a[i]==a[j])
						{
							cnt++;
						}

					
				}
				System.out.println(a[i]+" "+cnt+ "Times");
					}
				
				
		}
		
	}
}