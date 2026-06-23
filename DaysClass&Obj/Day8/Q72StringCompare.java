/*72. Implement your own version of `String.compareTo().*/
import java.util.*;
class Q72StringCompare
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=xyz.nextLine();
		System.out.println("Enter String");
		String s2=xyz.nextLine();
		
		int len=Math.min(s1.length(),s2.length());
		int result=0;
		for(int i=0;i<len;i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				result=s1.charAt(i)-s2.charAt(i);
				break;
			}
			else
			{
				result=s1.length()-s2.length();
			}
		}
		System.out.println("Result ="+result);
	}
}
