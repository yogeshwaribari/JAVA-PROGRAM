/*10. Find First Character
Problem Statement
Create class FirstCharacter{
} with methods:
void setString(String str)
char getFirstCharacter()
Method Description
void setString(String str)
Stores string.
char getFirstCharacter()
Returns first character from string.
Example
Input: "Computer"
Output: 'C'
*/
import java.util.*;
class FirstCharacter
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	char getFirstCharacter()
	{
		int i=0;
		char ch[]=str.toCharArray();
		char a=ch[i];
		return a;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		FirstCharacter f=new FirstCharacter();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		f.setString(s);
		char result=f.getFirstCharacter();
		System.out.println("Output :"+result);
	}
}