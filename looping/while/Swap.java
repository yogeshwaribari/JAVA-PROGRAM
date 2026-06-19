/*
Question 20: Write a java program to swap first and last digits of a number.
Input:

Number = 1234

Output:

Swapped Number = 4231

Explanation:

First digit (1) and last digit (4) are interchanged.
Middle digits remain the same.
*/
import java.util.Scanner;
class Swap
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt(); //123
		int temp =no; //123=123
		int last = no%10;//123%10=3
		while(temp>=10)//(123>=10)true,(12>=10)true,(1>=10)false
		{
			temp=temp/10;//123/10=12, 12/10=1
		}
		int first=temp; //1=1
		int d=1;
		temp=no; //123=123
		while(temp>=10)//(123>=10) true,(12>=10),(1>=10)false
		{
			temp=temp/10; //123/10=12 , 12/10=1
			d = d*10;//1*10=10, 10*10=100
		}
		int m = (no%d)/10;//123%100=23  23/10=2
		int r = (last*d)+(m*10)+first;//300+20+1
		System.out.println(r);//321
	}
}