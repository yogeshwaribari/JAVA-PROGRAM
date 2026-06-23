/*71. Implement your own version of `String.equals()`.*/

import java.util.*;
class Q71StringEqual
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=xyz.nextLine();
		System.out.println("Enter String");
		String s2=xyz.nextLine();
		boolean flag=true;
		if(s1.length()!=s2.length())
		{
			flag=false;
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					flag=false;
				}
			}
		}
		if(flag)
		{
			System.out.println("Equals");
		}
		else{
			System.out.println("Not Equals");
		}
	}
}