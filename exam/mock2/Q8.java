/*
Q8. You are given a sorted integer array that may contain duplicate values. Your task is to remove all duplicate elements so that each number appears only once and print the total count of unique elements.
Description:
Use two pointers:
•
One pointer keeps track of unique elements position.
•
Another pointer scans the array. Whenever a new unique element is found, place it in the correct position.
Input:
arr = [1, 1, 2, 2, 3, 4, 4, 5]
Output:
Unique Elements: [1, 2, 3, 4, 5] Count = 5
*/
import java.util.Scanner;
class Q8
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[8];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		int size=a.length;
		
		//check unique elements
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++) 
			{
				if(a[i]==a[j]) //check same element
				{
					for(int k=j;k<size-1;k++)
					{
							a[k]=a[k+1];
					}
						j--;
						size--;
				}
			}
			
		}
		System.out.println("Unique elements");
		int cnt=0;
		for(int i=0;i<=size-1;i++)
		{
			System.out.print(" "+a[i]);
			cnt++; //count elements
		}
		System.out.println(" Count = "+cnt);
		
		
	}
}