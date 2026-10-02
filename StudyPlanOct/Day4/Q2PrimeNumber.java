/*2. Take start and end values and print all prime numbers in the range.
 Also print the total number of primes and their sum. */
import java.util.*;
class Q2PrimeNumber
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Starting point");
		int s=xyz.nextInt();
		System.out.println("Enter Ending point");
		int e=xyz.nextInt();
		int tcnt=0;
		int sum=0;
		for(int i=s;i<=e;i++)
		{
			int cnt=0;
			for(int j=1;j<=i;j++)
			{
			
			if(i%j==0)
			{
				cnt++;
			}
			}
			if(cnt==2)
			{
				System.out.println(i+" ");
				tcnt++;
				sum=sum+i;
			}
		}
		System.out.println("Total numbers of primes ="+tcnt);
		System.out.println("Sum of all primes ="+sum);
	}
}