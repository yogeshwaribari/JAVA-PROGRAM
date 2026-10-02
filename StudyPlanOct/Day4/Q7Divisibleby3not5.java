/*7. Take start and end values and print all numbers that are divisible by 3 but not by 5. 
Also print their count and sum. */
import java.util.*;
class Q7Divisibleby3not5
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter stating point");
		int s=xyz.nextInt();
		System.out.println("Enter Ending point");
		int e=xyz.nextInt();
		int cnt=0;
		int sum=0;
		for(int i=s;i<=e;i++)
		{
			if(i%3==0 && i%5!=0)
			{
				System.out.println(i+" ");
				cnt++;
				sum=sum+i;
			}
		}
		System.out.println("Count ="+cnt);
		System.out.println("Sum ="+sum);
	}
}
