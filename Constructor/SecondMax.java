/*Question 19: Write a Java program to find second highest number from Number objects.

Description: Create Number class with value field. Store numbers using constructor and find 
second maximum value.
INPUT:
10 40 25 90 60

OUTPUT:
Second Highest Number: 60

EXPLANATION:
Create Number class with field value. Store 5 numbers in array using constructor. Find maximum 
and second maximum. First find max = 90. Then find second max by finding next highest (exclude max) = 60. 
Iterate through array, track max and secondMax values.
*/
import java.util.*;
class Number{
	int value;
	
	Number(int value)
	{
		this.value=value;
	}
}
class SecondMax{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Number n[]=new Number[5];
		System.out.println("Enter 5 Numbers");
		for(int i=0;i<n.length;i++)
		{
			int num=xyz.nextInt();
			n[i]=new Number(num);
		}
		int sm=n[1].value;
		int max=n[0].value;
		for(int i=1;i<n.length;i++)
		{
			if(max<n[i].value)
			{
				sm=max;
				max=n[i].value;
			}
			else if(n[i].value<max && n[i].value>sm)
			{
				sm=n[i].value;
			}
		}
		System.out.println("Second Highest Number: "+sm);
	}
}