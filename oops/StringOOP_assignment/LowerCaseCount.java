/*21. Count Lowercase Letters
Class Name: LowerCaseCount
Methods:
void setString(String str)
int getLowerCaseCount()
Example
Input:
 "JaVA"
Output:
 1
*/
import java.util.*;
class LowerCaseCount
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	int getLowerCaseCount()
	{
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		LowerCaseCount l=new LowerCaseCount();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		l.setString(s);
		int result=l.getLowerCaseCount();
		System.out.println("Output :"+result);
	}
}