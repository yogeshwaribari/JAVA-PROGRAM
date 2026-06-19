/*
Question 40: Write a Java program to print all automorphic numbers between 1 and n. 
An automorphic number’s square ends with the number itself (e.g., 5² = 25).
Explanation:
Use loop to check square and a while loop to match last digits.
Input:
n = 100

Output:
1 5 6 25 76

Explanation:
Example:
5² = 25 ? ends with 5
25² = 625 ? ends with 25
Such numbers are called Automorphic Numbers.
*/
import java.util.Scanner;
class AutomorphicNum
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = xyz.nextInt();
		for(int i=1;i<=n;i++)
		{
			int temp =i;
			int sq = i*i;
			int flag =1;
			while(temp>0)
			{
				int d= sq%10;
				if(temp%10!=d)
				{
					flag =0;
					break;
				}
				temp = temp/10;
				sq=sq/10;
			}
			
			if(flag==1)
			{
				System.out.println(" "+i);
			}
		}
		
	}
}
