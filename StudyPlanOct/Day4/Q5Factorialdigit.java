/*5. Take a number and calculate the factorial of each digit.
 Find their total sum and check whether the number is a Strong number. */
 import java.util.*;
 class Q5Factorialdigit
 {
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=xyz.nextInt();
		int sum=0;
		int temp=n;
		while(n!=0)
		{
		int fact=1;
			int d=n%10;
			for(int i=1;i<=d;i++)
			{
				fact*=i;
			}
			sum=sum+fact;
			n=n/10;
		}
		
		System.out.println("Total number ="+sum);
		if(temp==sum)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not Strong number");
		}
	}
 }
 