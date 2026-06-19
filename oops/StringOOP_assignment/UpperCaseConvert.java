/*5. Convert String to Uppercase
Problem Statement
Create class UpperCaseConvert with methods:
void setString(String str)
String getUpperCase()
Method Description
void setString(String str)
Stores string.
String getUpperCase()
Converts lowercase letters into uppercase and returns result.
Example
Input: "java"
Output: "JAVA"
*/
import java.util.*;
class UpperCaseConvert{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	String getUpperCase()
	{
		String upp="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch=(char)((int)ch-32);
			}
			upp=upp+ch;
		}
		return upp;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		UpperCaseConvert u=new UpperCaseConvert();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		u.setString(s);
		String result=u.getUpperCase();
		System.out.println("Output :"+result);
	}
}