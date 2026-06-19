/*8. Count Total Words
Problem Statement
Create class WordCount with methods:
void setString(String str)
int getWordCount()
Method Description
void setString(String str)
Accepts sentence.
int getWordCount()
Counts total words and returns count.
Example
Input: "Java is easy"
Output: 3
*/
import java.util.*;
class WordCount
{
	String str;
	
	void setString(String str)
	{
		this.str=str;
	}
	int getWordCount()
	{
		int cnt=1;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		WordCount w=new WordCount();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		w.setString(s);
		int result=w.getWordCount();
		System.out.println("Output :"+result);
	}
}