/*
13. Print Duplicate Characters (No LeetCode)
Given a string, identify and print all characters that occur more than once in the string.
 Each duplicate character should be printed only once. Example: Input: "programming" → Output: "r g m"*/
import java.util.*;
class Day1Q13Duplicate
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		String s="programming";
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==ch)
				{
					cnt++;
				}
			}
		
		if(cnt>1)
		{
			boolean flag =false;
			for(int k=0;k<i;k++)
			{
				if(s.charAt(k)==ch)
				{
					flag=true;
					break;
				}
			}
		
		if(!flag)
		{
			System.out.println("result = "+ch);
		}
		}
		}
	}
}