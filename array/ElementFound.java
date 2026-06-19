/*
Question 6: Write a java program to search an element in an array , its element found or not.
Input:
Array = {10, 20, 30, 40, 50}
Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, 
print "found" with index; otherwise print "not found".
*/
import java.util.Scanner;
class ElementFound
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter array size");
		int index = xyz.nextInt();
		int a[] = new int[index];
		int cnt =0;
		System.out.println("Enter Array Element");
		for(int i=0; i<index;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter Search Element");
		int skey= xyz.nextInt();
		boolean flag =false;
		for(int i=0;i<index;i++)
		{
			if(a[i]==skey)
			{
				flag =true;
				break;
				
			}
			cnt++;
		}
		if(flag)
		{
			System.out.println("Element " +skey+ " found at index " +cnt);
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}