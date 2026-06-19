/*28. Remove Particular Character
Class Name: RemoveCharacter
{
}
Methods:
void setData(String str, char ch)
String removeCharacter()
Example
Input:
 "banana", 'a'
Output:
 "bnn"
*/
import java.util.*;
class RemoveCharacter
{
	String str;
	char ch;
	void setData(String str, char ch)
	{
		this.str=str;
		this.ch=ch;
	}
	String removeCharacter()
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c!=ch)
			{
				result+=c;
			}
		}
		return result;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		RemoveCharacter r=new RemoveCharacter();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Enter character from remove string");
		char ch=xyz.next().charAt(0);
		r.setData(s,ch);
		String result=r.removeCharacter();
		System.out.println("Output :"+result);
	}
	
}