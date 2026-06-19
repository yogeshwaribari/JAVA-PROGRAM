/*3. Reverse String
Problem Statement
Create class ReverseString with methods:
void setString(String str)
String getReverse()
Method Description
void setString(String str)
Stores string into variable.
String getReverse()
Returns reverse of string.
Example
Input: "Java"
Output: "avaJ"
Explanation
Characters are printed from last to first.
*/
import java.util.*;
class ReverseString
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	void getReverse() //use void dont use return 
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		//return rev;
		System.out.println("Reverse String ="+rev);
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		ReverseString r=new ReverseString();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		r.setString(s);
		r.getReverse();
		//String result=r.getReverse();
		//System.out.println("Reverse String ="+result);
	}

}