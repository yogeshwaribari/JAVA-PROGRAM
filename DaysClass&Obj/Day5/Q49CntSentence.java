/*49. Count the number of sentences in a paragraph.*/
import java.util.*;
class Q49CntSentence
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		String arr[]=s.split(" ");
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=0;j<arr[i].length();j++)
			{
				char ch=arr[i].charAt(j);
			if(ch=='.' || ch=='!' ||ch=='?')
			{
				cnt++;
			}
			}
		}
		System.out.println("Sentence :"+cnt);
	}
}