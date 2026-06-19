/*42. Find the first repeated character.*/
import java.util.*;
class Q42FirstRepeat
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)==ch)
				{
					cnt++;
				}
			}
			if(cnt!=1)
				{
					System.out.println("Repeated char :"+ch);
					break;
				}
		}
	}
}