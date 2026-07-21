/*65. Check whether a string ends with a given suffix.*/
import java.util.*;
class Q65Suffix
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Enter suffix");
		String suff=xyz.nextLine();
		boolean flag=true;
		if(suff.length()>s.length())
		{
			flag=false;
		}
		else{
			int i=s.length()-1;
			int j=suff.length()-1;
			
			while(j>=0)
			{
				if(suff.charAt(j)!=s.charAt(i))
				{
					flag=false;
					break;
				}
				i--;
				j--;
			}
			
		}
		if(flag)
		{
			System.out.println("Ends With suffix");
		}
		else{
			System.out.println("Not End With suffix");
		}
		/*
		if(s.endsWith(suff))
		{
			System.out.println("Ends With suffix");
		}
		else
		{
			System.out.println("Not End With suffix");
		}
		*/
	}
}