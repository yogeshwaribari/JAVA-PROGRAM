/*Question 5: Write a Java program to calculate average of numbers using Integer wrapper 
class with autoboxing and unboxing.
Asked In Practice Assignment
Input:
Enter size: 4
Enter numbers: 10 20 30 40

Output:
Average is: 25

Explanation:
Read 4 numbers as primitive int, store in Integer array (autoboxing). To calculate average, 
sum all elements by unboxing each Integer to int, then divide by count. Average = Sum / Count = 
(10+20+30+40) / 4 = 100 / 4 = 25.*/
import java.util.*;
class Q5CalAvg
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter size");
		int size=xyz.nextInt();
		Integer arr[]=new Integer[size];
		System.out.println("Enter numbers");
		for(int i=0;i<size;i++)
		{
			arr[i]=xyz.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum+=arr[i];
		}
		int avg=sum/size;
		System.out.println("Average is :"+avg);
	}
}