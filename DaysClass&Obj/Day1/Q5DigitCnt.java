/*5.Count the number of digits in a string.*/
import java.util.*;
class Q5DigitCnt
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String");
		String s=xyz.nextLine();
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				cnt++;
			}
		}
		System.out.println("Digits :"+cnt);
	}
}