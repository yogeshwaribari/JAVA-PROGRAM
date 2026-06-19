/*Question 26: Write a Java program to count even numbers stored in object array.

Description: Create Number class storing integer. Count even numbers.
Asked In: Practice Assignment

INPUT:
10 15 22 33 40

OUTPUT:
Even Numbers Count: 3

EXPLANATION:
Create Number class with field value. Store 5 numbers in array using constructor: 
10, 15, 22, 33, 40. Loop through array, check if value % 2 == 0 (even). Count: 10 (even), 
22 (even), 40 (even) = 3 even numbers. Display count.*/
import java.util.*;
class Number{
	int value;
	
	Number(int value)
	{
		this.value=value;
	}
	void display(int cnt)
	{
		System.out.println("Even Numbers Count:"+cnt);
	}
}
class EvenCnt
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Number n[]=new Number[5];
		System.out.println("Enter Number");
		for(int i=0;i<n.length;i++)
		{
			int value=xyz.nextInt();
			n[i]=new Number(value);
		}
		int cnt=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i].value%2==0)
			{
				cnt++;
			}
		}
		n[0].display(cnt);
	}
}
