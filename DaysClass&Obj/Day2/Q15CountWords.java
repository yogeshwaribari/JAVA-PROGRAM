/*15. Count the number of words in a sentence.*/
import java.util.*;
class Q15CountWords
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		int cnt=1;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				cnt++;
			}
		}
		System.out.println("Count Word:"+cnt);
	}
}