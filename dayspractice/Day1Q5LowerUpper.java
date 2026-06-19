/*
5. Convert Lowercase to Uppercase (No LeetCode)
Given a string containing lowercase letters, convert all characters into uppercase and return the
updated string.
Example: Input: "world" → Output: "WORLD"
*/
import java.util.*;
class Day1Q5LowerUpper
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=xyz.nextLine();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				ch=(char)(int)(ch-32);
				
			}
			result+=ch;
		}
		System.out.println("Uppercase = "+result);
		
	}
}