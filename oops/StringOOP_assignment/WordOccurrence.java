/*30. Count Occurrence of Word
Class Name: WordOccurrence
Methods:
void setData(String sentence, String word)
int getOccurrence()
Example
Input:
 Sentence: "Java is easy and Java is powerful"
Word: "Java"
Output:
 2
*/
import java.util.*;
class WordOccurrence
{
	String sentence;
	String word;
	
	void setData(String sentence, String word)
	{
		this.sentence=sentence;
		this.word=word;
	}
	int getOccurrence()
	{
		int cnt=0;
		String arr[]=sentence.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(word))
			{
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		WordOccurrence w=new WordOccurrence();
		System.out.println("Enter String");
		String s=xyz.nextLine();
		System.out.println("Enter word");
		String word=xyz.nextLine();
		w.setData(s,word);
		int result=w.getOccurrence();
		System.out.println("Output :"+result);
		
	}
}