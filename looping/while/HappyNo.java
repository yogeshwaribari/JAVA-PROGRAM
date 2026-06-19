/*
Question 27: Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps wherein each step number is 
replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with 
digits square sum, we reach 1.
Input:

Number = 19

Output:

Happy Number

Explanation:

1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
Since it reaches 1, it is a Happy Number.
*/
import java.util.Scanner;
class HappyNo
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number");
		int no = xyz.nextInt();
		int sum=0;
		 while(no != 1 && no != 4)
        {
            sum = 0;

		while(no>0)
		{
			int rem = no%10;
			sum = sum + (rem*rem);
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