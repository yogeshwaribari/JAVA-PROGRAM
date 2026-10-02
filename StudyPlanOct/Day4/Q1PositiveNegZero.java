/*1. Take n numbers from the user and count how many are positive, negative, and zero. 
Also print the largest positive number and smallest negative number. */
import java.util.*;
class Q1PositiveNegZero
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter numbers size");
		int n=xyz.nextInt();
		
		int pcnt=0;
		int ncnt=0;
		int zcnt=0;
		int larpos=0;
		int smallneg=0;
		System.out.println("Enter numbers");
		for(int i=1;i<=n;i++)
		{
			int num=xyz.nextInt();
			
			if(num>0)
			{
				pcnt++;
				if(num>larpos)
				{
					larpos=num;
				}
			}
			else if(num<0)
			{
				ncnt++;
				if(num<smallneg)
				{
					smallneg=num;
				}
			}
			else{
				zcnt++;
			}
		}
		System.out.println("Positive count ="+pcnt);
		System.out.println("Negative count ="+ncnt);
		System.out.println("Zero count ="+zcnt);
		System.out.println("largest positive number ="+larpos);
		System.out.println("smallest negative number ="+smallneg);
	}
}