/*1. Count Total Vowels
Problem Statement
Create class name as CountVowel with two methods:
void setString(String str)
int getVowelCount()
Method Description
void setString(String str)
This method accepts a string as parameter and stores it inside class variable.
int getVowelCount()
This method counts total vowels (a, e, i, o, u) present in string and returns total count.
Example
Input: "Education"
Output: 5
Explanation
The vowels are:
 E, u, a, i, o
Total vowels = 5
*/
import java.util.*;
class CountVowel
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	void getVowelCount()
	{
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)((int)ch+32);
			}
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				cnt++;
			}
		}
		System.out.println("Vowel :"+cnt);
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		CountVowel c=new CountVowel();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		c.setString(s);
		c.getVowelCount();
	}
}