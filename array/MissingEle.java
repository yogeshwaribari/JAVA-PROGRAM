/*
Question 8: Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, 
it is missing.
*/
import java.util.Scanner;
class MissingEle
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter array size");
		int index = xyz.nextInt();
		int a[]= new int[index];
		System.out.println("Enter array elements");
		for(int i=0; i<index;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter max Number");
		int n = xyz.nextInt();
		for(int i=1;i<=n;i++)
		{
			boolean flag=false;
			for(int j=0;j<index;j++)
			if(i==a[j])
			{
				flag = true;
				break;
			}
			if(flag==false)
			System.out.print(" "+i);
		}
	}
}