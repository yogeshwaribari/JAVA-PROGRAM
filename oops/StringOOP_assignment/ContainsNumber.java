/*27. Check String Contains Number
Class Name: ContainsNumber
Methods:
void setString(String str)
boolean hasNumber()
Example
Input:
 "Java123"
Outpu
*/
import java.util.*;
class ContainsNumber
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	boolean hasNumber()
	{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				return true;
			}
			
		}
		return false;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		ContainsNumber c=new ContainsNumber();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		c.setString(s);
		boolean result=c.hasNumber();
		System.out.println("Output :"+result);
	 
	}
}