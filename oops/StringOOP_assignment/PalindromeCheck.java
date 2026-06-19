/*4. Check Palindrome String
Problem Statement
Create class PalindromeCheck with methods:
void setString(String str)
boolean isPalindrome()
Method Description
void setString(String str)
Accepts string input.
boolean isPalindrome()
Checks whether string is palindrome or not and returns true or false.
Example
Input: "madam"
Output: true
Explanation
Original and reverse strings are same.
*/
import java.util.*;
class PalindromeCheck
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	boolean isPalindrome()
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
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
		PalindromeCheck p=new PalindromeCheck();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		p.setString(s);
		boolean result=p.isPalindrome();
		System.out.println(result);
	}
}