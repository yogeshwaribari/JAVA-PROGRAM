/*25. Check whether a string contains only uppercase letters.*/
import java.util.*;
class Q25CheckUppercase
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
			if(!(ch>='A' && ch<='Z'))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Not contain UpperCase");
		}
		else
			System.out.println("Contain UpperCase");
	}
}