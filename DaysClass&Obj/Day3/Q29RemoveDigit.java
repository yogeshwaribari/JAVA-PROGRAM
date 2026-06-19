/*29. Remove all digits from a string.*/
import java.util.*;
class Q29RemoveDigit
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		
		String str="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!(ch>='0' && ch<='9'))
			{
				str+=ch;
			}
		}
		System.out.println("Remove No :"+str);
	}
}
