/*3. Take a number and find its largest digit, smallest digit, sum of digits, 
and count of even and odd digits using loops and if-else.*/
import java.util.*;
class Q3Mixdigit 
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter number");
		int n =xyz.nextInt();
		int ecnt=0;
		int ocnt=0;
		int sd=Integer.MAX_VALUE;
		int ld=0;
		int sum=0;
		
		while(n!=0)
		{
			int d=n%10;
			if(d>ld)
			{
				ld=d;
			}
			else if(d<sd)
			{
				sd=d;
			}
			if(d%2==0)
			{
				ecnt++;
			}
			else{
				ocnt++;
			}
			sum+=d;
			n=n/10;
		}
		System.out.println("Largest digit ="+ld);
		System.out.println("Smallest digit ="+sd);
		System.out.println("Sum of digits ="+sum);
		System.out.println("Even count ="+ecnt);
		System.out.println("Odd count ="+ocnt);
	}
}