/*19. Toggle Case
Class Name: ToggleCase
Methods:
void setString(String str)
String toggle()
Description
Convert uppercase to lowercase and lowercase to uppercase.
Example
Input:
 "JaVa"
Output:
 "jAvA"
*/
import java.util.*;
class ToggleCase
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	String toggle()
	{
		String a="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)((int)ch-32);
			}
			else
			{
				ch=(char)((int)ch+32);
			}
			a=a+ch;
		}
		return a;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		ToggleCase t=new ToggleCase();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		t.setString(s);
		String result=t.toggle();
		System.out.println("Output :"+result);
	}
	
	
}