/*7.Convert a string to uppercase.*/
import java.util.*;
class Q7UpperCase
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
			if(ch>='a' && ch<='z')
			{
				ch=(char)((int) ch-32);
			}
			str+=ch;
		}
		System.out.println(str);
	}
}
