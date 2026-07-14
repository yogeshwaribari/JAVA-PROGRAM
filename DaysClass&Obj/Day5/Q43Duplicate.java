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
			boolean flag=false;
			for(int j=0;j<str.length();j++)
			{
				 if(ch==str.charAt(j)) 
				 {
					 flag =true;
					 break;
				 }
			}
			if(flag==false)
			{
				str+=ch;
			}
		}
		System.out.println("Remove duplicate :"+str);
	}
}