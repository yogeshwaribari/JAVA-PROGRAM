/*4. Take a number and repeatedly find the sum of its digits until a single-digit number 
is obtained. Check whether the final digit is even or odd. */
import java.util.*;
class Q4Singledigitsum
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number");
		int n=xyz.nextInt();
		int num=0;
		
		while(n>9)
		{
			int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("sum ="+sum);
			n=sum;
		}
		System.out.println("Final sum ="+n);
		if(n%2==0)
		{
			System.out.println("Digit is even");
		}
		else
		{
			System.out.println("Digit is odd");
		}
	}
}