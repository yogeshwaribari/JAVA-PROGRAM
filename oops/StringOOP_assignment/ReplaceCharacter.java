/*15. Replace Character
Class Name: ReplaceCharacter
Methods:
void setData(String str, char oldCh, char newCh)
String replaceCharacter()
Description
Replace old character with new character.
Example
Input:
 "java", 'a', 'o'
Output:
 "jovo"
*/
import java.util.*;
class ReplaceCharacter
{
	String str;
	char oldch;
	char newch;
	
	void setData(String str, char oldch, char newch)
	{
		this.str=str;
		this.oldch=oldch;
		this.newch=newch;
	}
	
	String replaceCharacter()
	{
		char arr[]=str.toCharArray();
		String s1="";
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==oldch)
			{
				arr[i]=newch;
			}
			s1=s1+arr[i];
			
		}
		return s1;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		ReplaceCharacter rc=new ReplaceCharacter();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Enter old character");
		char o=xyz.next().charAt(0);
		System.out.println("Enter new character");
		char n=xyz.next().charAt(0);
		
		rc.setData(s,o,n);
		String result=rc.replaceCharacter();
		System.out.println("Output :"+result);
	}
	
}