/*string uppercase and lower case*/
import java.util.*;
class StringUppercase
{
	public static void main(String x[])
	{
		//uppercase
		/*String s="abc";
		String s1=s.toUpperCase();
		System.out.println(s1);*/
		
		//lowercase
		/*String s="ABC";
		String s1=s.toLowerCase();
		System.out.println(s1);
		*/
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=xyz.nextLine();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ch=(char)(int)(ch+32);
			}
		
		result=result+ch;
		
		}
		System.out.println("new string = "+result);
	}
}
