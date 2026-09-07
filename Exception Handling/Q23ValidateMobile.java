/*Question 23: Write a Java program to validate mobile numbers.

Accept mobile number. If digits are not exactly 10, throw exceptions.
Asked In Practice Assignment
Input:
Enter mobile: 12345

Output:
Invalid Mobile Number

Explanation:
Mobile number validation checks exact format. When entered number has only 5 digits instead of 10,
 exception is thrown immediately. This ensures data integrity by validating input format before
 storing or processing. Valid mobile numbers must be exactly 10 digits for proper communication 
 and contact management.*/
import java.util.*;
class Q23ValidateMobile
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter mobile");
		String num=xyz.nextLine();
		try
		{
			if(num.length()!=10)
			{
				throw new Exception("Invalid Mobile Number");
			}
			for(int i=0;i<num.length();i++)
			{
				char ch=num.charAt(i);
				if(ch>'0' || ch<'9')
				{
					throw new Exception("Invalid Mobile Number");
				}
			}
				System.out.println("Number :"+num);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}