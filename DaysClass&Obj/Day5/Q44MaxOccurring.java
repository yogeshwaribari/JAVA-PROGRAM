/*44. Find the maximum occurring character.*/
import java.util.*;
class Q44MaxOccurring
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		int maxcnt=0;
		char maxchar=s.charAt(0);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int cnt=0;
			
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt>maxcnt)
			{
				maxcnt=cnt;
				maxchar=s.charAt(i);
			}
		}
		System.out.println("MaxChar :"+maxchar);
	}
}