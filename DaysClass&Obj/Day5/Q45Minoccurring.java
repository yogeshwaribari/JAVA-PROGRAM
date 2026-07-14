/*45. Find the minimum occurring character.*/
import java.util.*;
class Q45Minoccurring
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		int mincnt=s.length();
		char minchar=s.charAt(0);
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
			if(cnt<mincnt)
			{
				mincnt=cnt;
				minchar=s.charAt(i);
			}
		}
		System.out.println("MinChar :"+minchar);
	}
}