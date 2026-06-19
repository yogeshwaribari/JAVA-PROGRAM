/*18. Check Anagram String
Class Name: AnagramCheck
Methods:
void setStrings(String s1, String s2)
boolean isAnagram()
Description
Checks whether both strings contain same characters.
Example
Input:
 "listen", "silent"
Output:
 true
*/
import java.util.*;
class AnagramCheck
{
	String s1;
	String s2;

		void setStrings(String s1,String s2)
		{
			this.s1=s1;
			this.s2=s2;	
		}
		boolean isAnagram()
		{
			char ch[]=s1.toCharArray();
			char arr[]=s2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(arr);
			String k=new String(ch);
			String y=new String(arr);
			if(k.equals(y))
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
			AnagramCheck a=new AnagramCheck();
			System.out.println("Enter string1");
			String s=xyz.nextLine();
			System.out.println("Enter String2");
			String ss=xyz.nextLine();
			
			a.setStrings(s,ss);
			boolean result=a.isAnagram();
			System.out.println("Output :"+result);
		}
}