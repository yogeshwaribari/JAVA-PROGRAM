/*61. Count all palindromic substrings.*/
import java.util.*;
class Q61PalindromicSubString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.next();
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String sub=s.substring(i,j);
				String rev="";
				for(int k=sub.length()-1;k>=0;k--)
				{
					rev=rev+sub.charAt(k);
				}
				if(sub.equals(rev))
				{
					cnt++;
				}

			}
		}
		System.out.println("Palindrom Substring :"+cnt);
	}
}