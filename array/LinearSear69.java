/*Question 69: Linear Search
Description:
Search target in array.
Input:
Array: [4,7,2,9]
Target = 2

Output:
Found

Explanation:
Worst case checks all elements.

Time Complexity: O(n)
*/
import java.util.Scanner;
class LinearSear69
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[4];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter target value");
		int target=xyz.nextInt();
		int index=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				index=i;
				break;
			}
		}
		if(index!=-1)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}
}
