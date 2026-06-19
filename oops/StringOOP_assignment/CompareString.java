/*9. Compare Two Strings
Problem Statement
Create class CompareString with methods:
void setStrings(String s1, String s2)
boolean isEqual()
Method Description
void setStrings(String s1, String s2)
Accepts two strings.
boolean isEqual()
Compares both strings and returns true if same.
Example
Input:
 "java", "java"
Output:
 true
*/
import java.util.*;
class CompareString
{
	String s1;
	String s2;
	
	void setStrings(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	boolean isEqual()
	{
		if(s1.equals(s2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		CompareString c=new CompareString();
		System.out.println("Enter first String");
		String str1=xyz.nextLine();
		System.out.println("Enter second String");
		String str2=xyz.nextLine();
		
		c.setStrings(str1,str2);
		boolean result=c.isEqual();
		System.out.println("Output :"+result);
		
	}
	
}