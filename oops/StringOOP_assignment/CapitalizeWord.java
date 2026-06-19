/*29. Convert First Letter Capital
Class Name: CapitalizeWord
Methods:
void setString(String str)
String capitalize()
Example
Input:
 "java programming"
Output:
 "Java Programming"
*/
import java.util.*;
class CapitalizeWord
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	String capitalize()
	{
		String arr[]=str.split(" ");
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i].charAt(0);
			if(ch>='a' && ch<='z')
			{
				ch=(char)((int)ch-32);
			}
			result=result+ch+arr[i].substring(1)+" ";
		}
		return result;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		CapitalizeWord c=new CapitalizeWord();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		c.setString(s);
		String result=c.capitalize();
		System.out.println("Output :"+result);
	}
}

