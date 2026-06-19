/*
Question 34: Return the first element that repeats in the array.
Input:
Array = [10, 5, 3, 4, 3, 5, 6]

Output:
First repeating element = 5

Explanation:
Check elements from left to right and identify the element whose first 
occurrence appears earlier but repeats later in the array.
*/
import java.util.Scanner;
class RepeatsEle{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]= new int [7];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		boolean flag = false;
		System.out.println("Repeat element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					flag=true;
					break;	
				}
			}
			if(flag)
				break;
		}
	}
}