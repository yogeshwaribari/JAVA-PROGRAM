/*20. Count Uppercase Letters
Class Name: UpperCaseCount
Methods:
void setString(String str)
int getUpperCaseCount()
Example
Input:
 "JaVA"
Output:
 3
*/
import java.util.*;
class UpperCaseCount
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	int getUpperCaseCount()
	{
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		UpperCaseCount u=new UpperCaseCount();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		u.setString(s);
		
		int result=u.getUpperCaseCount();
		System.out.println("Output :"+result);
	}
}