/*Q1. Write a java program to check Number Is happy Number or Not happy using function recursion.*/
import java.util.*;
class Q1{
	public static int happy(int no)
	{
		
	int sum=0;
		 while(no!=1 && no!=4)
        {
            sum=0;

		while(no>0)
		{
			int rem=no%10;
			sum=sum+(rem*rem);
			no=no/10;
		}
		no=sum;
		}
		return no;//return value
	}
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = xyz.nextInt();
		int ans=happy(n);//function calling
		if(ans==1)
		{
			System.out.println("Happy Number");		
		}
		else
			
		{
			System.out.println("Not Happy Number");
		}
	}
}






