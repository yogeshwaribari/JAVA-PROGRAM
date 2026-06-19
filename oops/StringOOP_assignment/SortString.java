/*17. Sort Characters in String
Class Name: SortString
Methods:
void setString(String str)
String sortCharacters()
Description
Arrange characters alphabetically.
Example
Input:
 "dcba"
Output:
 "abcd"
*/
import java.util.*;
class SortString
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	String sortCharacters()
	{
		char arr[]=str.toCharArray();
		String s1="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			s1=s1+arr[i];
		}
		return s1;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		SortString ss=new SortString();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		ss.setString(s);
		String result=ss.sortCharacters();
		System.out.println("Output :"+result);
	}
}