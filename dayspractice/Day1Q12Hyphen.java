/*12. Replace Spaces with Hyphens (LC 1592 Inspired)
Given a string containing spaces, replace every space character with a hyphen (-) and 
return the modified string. Example: Input: "hello world" → Output: "hello-world"*/
import java.util.*;
class Day1Q12Hyphen
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter your string");
		String s=xyz.nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				sb.append('-');
			}
			else
			{
				sb.append(s.charAt(i));
			}
		}
		System.out.println("New = "+sb);
	}
}
