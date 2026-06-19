/*7. Find Length of String
Problem Statement
Create class StringLength with methods:
void setString(String str)
int getLength()
Method Description
void setString(String str)
Stores string.
int getLength()
Returns total number of characters in string.
Example
Input: "Programming"
Output: 11
*/
import java.util.*;
class StringLength
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	int getLength()
	{
		return str.length();
	}
	
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		StringLength sl=new StringLength();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		sl.setString(s);
		int result=sl.getLength();
		System.out.println("Output :"+result);
	}
}