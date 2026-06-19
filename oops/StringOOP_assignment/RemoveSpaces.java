/*12. Remove Spaces from String
Class Name: RemoveSpaces
Methods:
void setString(String str)
String removeSpace()
Description
Remove all spaces from string.
Example
Input: "Java Programming"
Output: "JavaProgramming"
*/
import java.util.*;
class RemoveSpaces
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	String removeSpace()
	{
		String sp="";
		
		for(int i=0;i<str.length();i++)
		{
			char  ch=str.charAt(i);
			if(ch!=' ')
			{
				sp=sp+ch;
			
			}
			
		}
		return sp;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		RemoveSpaces r=new RemoveSpaces();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		r.setString(s);
		String result=r.removeSpace();
		System.out.println("Output :"+result);
	}
}