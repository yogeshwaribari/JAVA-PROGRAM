/*32.Count uppercase and lowercase letters separately.*/
import java.util.*;
class Q32CntUpperLower
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		int ucnt=0;
		int lcnt=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ucnt++;
			}
			else
			{
				lcnt++;
			}
		}
		System.out.println("Uppercase Count :"+ucnt);
		System.out.println("Lowercase Count :"+lcnt);
	}
}