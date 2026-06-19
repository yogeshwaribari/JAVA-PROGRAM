/*
Q1. Write a java program to check if a number is a happy number or not.
*/
import java.util.Scanner;
class Q1
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number");
		int no = xyz.nextInt();
		int sum=0;
		 while(no != 1 && no != 4) 
        {
			sum = 0;
			while(no>0) 
			{
				int rem = no%10;
				sum = sum + (rem*rem); //sum + digit square
				no = no/10;
			}
			no=sum; 
		}
		if(no==1) 
		{
			System.out.println("Happy Number");		
		}
		else
		{
			System.out.println("Not Happy Number");
		}
	}
}