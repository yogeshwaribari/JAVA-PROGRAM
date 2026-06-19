/*2. Count Total Consonants
Problem Statement
Create class CountConsonant with methods:
void setString(String str)
int getConsonantCount()
Method Description
void setString(String str)
Accepts string from user.
int getConsonantCount()
Counts all consonants and returns count.
Example
Input: "Computer"
Output: 6
Explanation
Consonants are:
 C, m, p, t, r
*/
import java.util.*;
class CountConsonant
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	void getConsonantCount()
	{
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)((int)ch+32);
			}
			if(ch>='a' && ch<='z')
			{
			if(ch!='a' && ch!='i' && ch!='o'&&ch!='e'&&ch!='u')
			{
				cnt++;
			}
			}
		}
		System.out.println("Consonants :"+cnt);
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		CountConsonant c=new CountConsonant();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		c.setString(s);
		c.getConsonantCount();
	}
}