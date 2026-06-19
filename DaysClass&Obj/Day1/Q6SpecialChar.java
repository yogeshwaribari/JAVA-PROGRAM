/*6.Count the number of special characters in a string.*/
import java.util.*;
class Q6SpecialChar
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=xyz.nextLine();
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!(ch>='A' && ch<='Z' || ch>='a' && ch<='z' ||ch>='0' && ch<='9' || ch==' '))
			{
				cnt++;
			}
		}
		System.out.println("Special count :"+cnt);
	}
}
