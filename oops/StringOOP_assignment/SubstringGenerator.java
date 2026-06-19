/*32. Generate All Substrings
Class Name: SubstringGenerator
Methods:
void setString(String str)
void generateSubstring()
Description
Generate every possible substring.
Example
Input:
 "abc"
Output:
 a, b, c, ab, bc, abc
*/
import java.util.*;
class SubstringGenerator
{
	String str;
	void setString(String str)
	{
		this.str=str;
	}
	void generateSubstring()
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		SubstringGenerator sg=new SubstringGenerator();
		System.out.println("Enter String");
		String s =xyz.nextLine();
		sg.setString(s);
		sg.generateSubstring();
	}
}