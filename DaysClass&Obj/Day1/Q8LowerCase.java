/*8.Convert a string to lowercase.*/
import java.util.*;
class Q8LowerCase
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String l="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)((int)ch+32);
			}
			l+=ch;
		}
		System.out.println("Lower String:"+l);
	}
}