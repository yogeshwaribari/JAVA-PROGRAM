/*26. Find Smallest Word
Class Name: SmallestWord
Methods:
void setString(String str)
String getSmallestWord()
Example
Input:
 "Java is easy"
Output:
 "is"
*/
import java.util.*;
class SmallestWord
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	String getSmallestWord()
	{
		String arr[]=str.split(" ");
		String smaller=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i].length()<smaller.length())
			{
				smaller=arr[i];
			}
		}
		return smaller;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		SmallestWord sw=new SmallestWord();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		sw.setString(s);
		String result=sw.getSmallestWord();
		System.out.println("Output :"+result);
	}
}