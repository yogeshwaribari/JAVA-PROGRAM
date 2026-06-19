/*
30.Copy array elements
*/
import java.util.*;
class Day2Q30Copyele
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int [5];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=xyz.nextInt();
		}
		System.out.println("Copy elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}
		
	}
}