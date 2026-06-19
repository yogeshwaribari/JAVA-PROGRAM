/*14. Find Frequency of Character
Class Name: CharacterFrequency
Methods:
void setData(String str, char ch)
int getFrequency()
Description
Count how many times a character appears.
Example
Input:
 "banana", 'a'
Output:
 3
*/
import java.util.*;
class CharacterFrequency
{
	String str;
	char ch;
	
	void setData(String str,char ch)
	{
		this.str=str;
		this.ch=ch;
	}
	
	int getFrequency()
	{
		int cnt=0;
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ch)
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		CharacterFrequency cf= new CharacterFrequency();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Enter Character");
		char c=xyz.next().charAt(0);
		
		cf.setData(s,c);
		int result=cf.getFrequency();
		System.out.println("Output :"+result);
	}
}