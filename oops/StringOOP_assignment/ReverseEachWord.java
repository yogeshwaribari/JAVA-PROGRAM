/*24. Reverse Each Word
Class Name: ReverseEachWord
Methods:
void setString(String str)
String reverseWords()
Example
Input:
 "Java Language"
Output:
 "avaJ egaugnaL"
*/
import java.util.*;
class ReverseEachWord
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	String reverseWords()
	{
		String arr[]=str.split(" ");
		String result="";
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				char ch=arr[i].charAt(j);
				result=result+ch;
				
			}
			result=result+" ";
		}
		return result;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		ReverseEachWord r=new ReverseEachWord();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		r.setString(s);
		String result=r.reverseWords();
		System.out.println("Output :"+result);
	}
}