/*64. Check whether a string starts with a given prefix*/
import java.util.*;
class Q64Prefix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Enter prefix");
		String p=xyz.nextLine();//3
		boolean flag=true;
		if(p.length()>s.length())
		{
			flag=false;
		}
		else{
		for(int i=0;i<p.length();i++)
		{
			if(s.charAt(i)!=p.charAt(i))
			{
				flag=false;
				break;
			}
		}
		}
		if(flag)
		{
			System.out.println("Start with prefix");
		}
		else{
			System.out.println("Not start with prefix");
		}
		/*
		if(s.startsWith(p))
		{
			System.out.println("Start with prefix");
		}
		else
		{
			System.out.println("Not start with prefix");
		}
		*/
	}
}