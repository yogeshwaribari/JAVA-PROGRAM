/*62. Find the number of occurrences of a substring.*/
import java.util.*;
class Q62SubstringOccurr
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		int cnt=0;
		System.out.println("Enter Substring");
		String sub=xyz.nextLine();
		for(int i=0;i<=s.length()-sub.length();i++)
		{
			if(s.substring(i,i+sub.length()).equals(sub))
			{
				cnt++;
			}
		}
		System.out.println("occurrences :"+cnt);
	}
}