/*16. Remove Duplicate Characters
Class Name: RemoveDuplicate
Methods:
void setString(String str)
String removeDuplicateCharacters()
Description
Removes repeated characters from string.
Example
Input:
 "programming"
Output:
 "progamin"
*/
import java.util.*;
class RemoveDuplicate
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	String removeDuplicateCharacters()
	{ String a="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		int cnt=0;
		for(int j=0;j<a.length();j++)
			
		{
			if(ch==a.charAt(j))
			{
				cnt++;
			}
			
		}
		if(cnt==0)
		{
			a=a+ch;
		}
	}
	return a;
		
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		RemoveDuplicate r=new RemoveDuplicate();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		r.setString(s);
		String result=r.removeDuplicateCharacters();
		System.out.println("Output :"+result);
	}
}