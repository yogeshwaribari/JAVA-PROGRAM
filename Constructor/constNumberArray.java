/*Question 6: Write a Java program to store 5 numbers in an array using constructor and find maximum 
number.

Description: Create NumberArray class having an integer array. Initialize array using constructor.
 Find maximum number using logic.
INPUT:
Enter 5 numbers: 10 45 22 89 34

OUTPUT:
Maximum number is: 89

EXPLANATION:
Create NumberArray class with int[] array field. Use constructor public NumberArray(int[] nums) to 
initialize array. Create method findMax() to find maximum using loop. Compare each element and store
 maximum. Display maximum value.*/
import java.util.*;
class NumberArray
{	private int num[];
	
	NumberArray(int num[])
	{
		this.num=num;
	}
	void display()
	{
		int max=num[0];
		for(int i=1;i<num.length;i++)
		{
			
			if(max<num[i])
			{
				max=num[i];
			}
			
		}
		System.out.println("Maximum number is: "+max);
	}
}
class constNumberArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int num[]=new  int[5];
		System.out.println("Enter 5 Numbers");
		for(int i=0;i<num.length;i++)
		{
			num[i]=xyz.nextInt();
		}
		//num[i]=new NumberArray();
		NumberArray n=new NumberArray(num);
		n.display();
	}
}