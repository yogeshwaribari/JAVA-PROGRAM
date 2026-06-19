/*23. Check whether a string contains only digits.*/
import java.util.*;
class Q23CheckDigit
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
			if(ch<'0' || ch>'9')
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("String Contain digit");
		}
		else
		{
			System.out.println("String Not contain digit");
		}
	}
}