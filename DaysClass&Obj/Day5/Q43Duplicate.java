/*43. Remove duplicate characters from a string.*/
import java.util.*;
class Q43Duplicate
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String str="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(ch!=s.charAt(j))
				{
					str+=s.charAt(j);
				}
			}
		}
		System.out.println("Remove duplicate :"+str);
	}
}