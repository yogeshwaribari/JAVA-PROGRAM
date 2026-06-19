/*
18. Toggle Case of Characters (No LeetCode)
Given a string, change all uppercase letters to lowercase and all lowercase letters to uppercase. 
Return the transformed string. Example: Input: "HeLLo" → Output: "hEllO"*/
import java.util.*;
class Day1Q18Toggle
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=xyz.nextLine();
		String result="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(int)(ch+32);
			}
			else if(ch>='a' && ch<='z')
			{
				ch=(char)(int)(ch-32);
			}
			result+=ch;
		}
		System.out.println("Result string "+result);
		
	}
}