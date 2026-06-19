/*13. Count Special Characters
Class Name: SpecialCharacterCount
Methods:
void setString(String str)
int getSpecialCharacterCount()
Description
Counts symbols like @,#,$,%,&.
Example
Input: "Java@123#"
Output: 2
*/
import java.util.*;
class SpecialCharacterCount
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	int getSpecialCharacterCount()
	{
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'||ch==' '))
			{
				cnt++;
			}
		}
		return cnt;
	}
		public static void main(String x[])
		{
			Scanner xyz=new Scanner(System.in);
			SpecialCharacterCount sc=new SpecialCharacterCount();
			System.out.println("Enter String");
			String s=xyz.nextLine();
			
			sc.setString(s);
			int result=sc.getSpecialCharacterCount();
			System.out.println("Output :"+result);
		}
	
}