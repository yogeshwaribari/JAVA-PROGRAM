/*26. Check whether a string contains only lowercase letters.*/
import java.util.*;
class Q26CheckLowercase
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!(ch>='a' && ch<='z'))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Not contain Lowercase");
		}
		else
		{
			System.out.println("Contain Lowercase");
		}
	}
}