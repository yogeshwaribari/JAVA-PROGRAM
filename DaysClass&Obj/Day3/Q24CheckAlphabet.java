/*24. Check whether a string contains only alphabets*/
import java.util.*;
class Q24CheckAlphabet
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
			if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) )
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Contain only Alphabets");
		}
		else
		{
			System.out.println("Not Contain Alphabets");
		}
	}
}