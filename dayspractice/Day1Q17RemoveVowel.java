/*
17. Remove Vowels from a String (LC 1119)
Given a string, remove all vowels (a, e, i, o, u) from it and return the resulting string. 
Example: Input: "education" → Output: "dctn"
*/
import java.util.*;
class Day1Q17RemoveVowel
{
	public static void main(String x[])
	{
		String s ="education";
		String result="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
			{
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				{
					
				}
				else
				{
					result+=ch[i];
				}
			}
		}
		System.out.println("output = "+result);
	}
}