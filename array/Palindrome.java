/*
Question 33: Check whether the given array is a palindrome.
Input:
Array = [1, 2, 3, 2, 1]

Output:
true

Explanation:
Compare the first element with the last, the second with the second-last and 
continue until the middle; if all pairs match the array is a palindrome.
*/
import java.util.Scanner;
class Palindrome
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		int a[]=new int [5];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int str=0;
		int end=a.length-1;
		boolean flag = true;
		for(int i=0;str<end;i++)
		{
			if(a[str]!=a[end])
			{
				flag=false;
				break;
			}
			str++;
			end--;
		}
		if(flag)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}