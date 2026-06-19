/*
Q5. Given an integer array and a specific element, write a Java program to find the index position 
of that element in the array. If the element is not found, print -1.
Input :- Array: {10, 20, 30, 40, 50}
Element to find: 30
Output :- Element found at index: 2
*/
import java.util.Scanner;
class Q5
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Enter find element");
		int ele=xyz.nextInt(); //input search element
		boolean flag = false;
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele) //check element in array
			{
				//System.out.println(a[i]);
				flag=true;
				break;
			}
			cnt++; //count index
		}
		if(flag)
		{
		System.out.println("Element found at index: "+cnt);
		}
		else
		{
			System.out.println("Element Not found : -1");
		}
	}
}