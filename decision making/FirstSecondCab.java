/*
Question 45: The chef has to travel to another place. For this, he can avail any one of two cab services.
·        The first cab service charges XX rupees.
·        The second cab service charges YY rupees.
The chef wants to spend the minimum amount of money. Which cab service should the Chef take?
Input Format
·        The first line will contain TT - the number of test cases. Then the test cases follow.
·        The first and only line of each test case contains two integers XX and YY - the prices of 
first and second cab services respectively.
Output Format
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab 
service is cheaper, output ANY if both cab services have the same price.
You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy,
 Any will be considered identical).
Constraints
1<=T<=100
1<X<Y<=100
Input
30 65

Output
FIRST

Explanation
30 < 65 ? First cab is cheaper
*/
import java.util.Scanner;
class FirstSecondCab
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter First and Second Cab Price");
		int fc = xyz.nextInt();
		int sc = xyz.nextInt();
		if(fc<sc)
		{
			System.out.println("First Cab");
		}
		else if(fc==sc)
		{
			System.out.println("Any Cab");
		}
		else
		{
			System.out.println("Second Cab");
		}
	}
}