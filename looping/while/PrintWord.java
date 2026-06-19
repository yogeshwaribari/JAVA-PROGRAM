/*
Question 35: Write a java program to enter a number and print it in words.
Input:
Number = 123

Output:
One Two Three

Explanation:
Each digit is separated and converted into its word form.
1 ? One, 2 ? Two, 3 ? Three.
*/
import java.util.Scanner;
class PrintWord
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a numbers");
		int n = xyz.nextInt();
		if(n==0)
		{
			System.out.println("Zero");
			return;
		}
		int re=0;
		while(n>0)
		{
			int dig = n%10;
			re=re*10+dig;
			n= n/10;
		}	
		
			while(re>0)
			{
				int d= re%10;
				
				switch(d)
				{
					case 0: System.out.println("Zero"); break;					
					case 1: System.out.println("One"); break;
					case 2: System.out.println("Two"); break;
					case 3: System.out.println("Three"); break;
					case 4: System.out.println("Four"); break;
					case 5: System.out.println("Five"); break;
					case 6: System.out.println("Six"); break;
					case 7: System.out.println("Seven"); break;
					case 8: System.out.println("Eight"); break;
					case 9: System.out.println("Nine"); break;
				}	
					re = re/10;
			}
		
	}
}
