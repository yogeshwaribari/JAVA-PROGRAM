/*Intermediate Level String Programs (20)

11. Count Digits in String
Class Name: DigitCount
Methods:
void setString(String str)
int getDigitCount()
Description
Count total numeric digits present in string.
Example
Input: "Java123"
Output: 3
*/
import java.util.*;
class DigitCount
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	
	int getDigitCount()
	{
		int cnt=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		DigitCount d=new DigitCount();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		d.setString(s);
		int result=d.getDigitCount();
		System.out.println("Output :"+result);
	}
}