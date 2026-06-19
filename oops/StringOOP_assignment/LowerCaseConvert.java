/*6. Convert String to Lowercase
Problem Statement
Create class LowerCaseConvert with methods:
void setString(String str)
String getLowerCase()
Method Description
void setString(String str)
Accepts string.
String getLowerCase()
Converts uppercase letters into lowercase.
Example
Input: "JAVA"
Output: "java"
*/
import java.util.*;
class LowerCaseConvert
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	
	String getLowerCase()
	{
		String low="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)((int)ch+32);
			}
			low=low+ch;
		}
		return low;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		LowerCaseConvert l=new LowerCaseConvert();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		l.setString(s);
		String result=l.getLowerCase();
		System.out.println("Output :"+result);
	}
	
}