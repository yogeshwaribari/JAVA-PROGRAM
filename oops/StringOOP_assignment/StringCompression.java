/*
31. String Compression
Class Name: StringCompression
Methods:
void setString(String str)
String compress()
Description
Compress repeated characters.
Example
Input:
 "aaabbcc"
Output:
 "a3b2c2"
*/
import java.util.*;
class StringCompression
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	String compress()
	{
		String result="";
		//int cnt=1;
		for(int i=0;i<str.length();i++)
		{
			 int cnt=1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
			{
				cnt++;
				i++;
			}
			result=result+str.charAt(i)+cnt;
		}
		return result;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		StringCompression sc=new StringCompression();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		sc.setString(s);
		String result=sc.compress();
		System.out.println("Output :"+result);
	}
}