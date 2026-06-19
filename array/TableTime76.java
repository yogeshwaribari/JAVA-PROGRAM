/*Question 76: Print Multiplication Table up to n
Description:
Print multiplication tables from 1 to n.
Input:
n = 3

Output:
1 × 1 = 1
1 × 2 = 2
...
3 × 10 = 30

Explanation:
Outer loop runs n times.
Inner loop runs 10 times (constant).

Total operations = 10n

Time Complexity: O(n)
(If table goes up to n instead of 10 ? then O(n²))
*/
import java.util.Scanner;
class TableTime76
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter Nth value");
		int n = xyz.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int mul=0;
			for(int j=1;j<=10;j++)
			{
				mul=i*j;
				System.out.println(i+ "x" +j+ "=" +mul);
			}
			
		}
	}
}