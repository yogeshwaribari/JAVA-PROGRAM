/*
Question 16: Write a Java program to calculate the average of all elements present in an 
integer array.
Input Array:
[10, 20, 30, 40, 50]
Output:
Average of array elements = 30
Explanation
? The average of array elements is calculated by:
Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text
{Sum of all elements}}{\text{Number of elements}}Average=Number of elementsSum of 
all elements
? First, iterate through the array and add all elements to a variable sum.
? Then divide sum by the total number of elements (array.length) to get the average.
*/
import java.util.Scanner;
class AverageEle
{
	public static void main(String x[])
	{
		Scanner xyz =new Scanner(System.in);
		System.out.println("Enter array size");
		int size = xyz.nextInt();
		int a[] = new int[5];
		System.out.println("Enter array elements");
		for(int i=0; i<size;i++)
		{
			a[i]=xyz.nextInt();
		}
		int sum =0;
		int avg = 0;
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
			avg=sum/size;
		}
		System.out.println("Average of array elements ="+avg);
	}
}