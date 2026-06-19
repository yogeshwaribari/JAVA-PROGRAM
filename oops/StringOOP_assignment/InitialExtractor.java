/*23. Extract Initial Letters
Class Name: InitialExtractor
Methods:
void setString(String str)
String getInitials()
Example
Input:
 "Central Processing Unit"
Output:
 "CPU"
*/
import java.util.*;
class InitialExtractor
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	String getInitials()
	{
		String arr[]=str.split(" ");
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i].charAt(0);
			if(ch>='A' && ch<='Z')
			{
				result=result+ch;
			}
		}
		return result;
		
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		InitialExtractor i=new InitialExtractor();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		i.setString(s);
		String result=i.getInitials();
		System.out.println("Output :"+result);
	}
}